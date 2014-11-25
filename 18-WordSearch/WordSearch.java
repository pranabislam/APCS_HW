import java.io.*;
import java.util.*;

public class WordSearch {
    private char[][] board, key;
    Random r = new Random();
    private ArrayList<String> wordList = new ArrayList<String>();
    private ArrayList<String> words = new ArrayList<String>();

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }

    // Constructor
    public WordSearch() {
	this(20,40);
    }
 
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }


    public boolean overlapGeneral(String w, int row, int col, int dy, int dx){
	int i = 0;
	int c = col;
	int r = row;
	while (i < w.length()){
	    if ((w.charAt(i) == board[r][c])||
		(board[r][c] == '.')){
		i++;
		c = c + dx;
		r = r + dy;
	    }
	    else {
		return true;
	    }
	}
	return false;
    }

      
    public boolean generalErrorCheck(String w, int row, int col, int dy, int dx){
	if (dx > 0){
	    if ((w.length() + col > board[0].length) ||
		(col > board[0].length - 1) ||
		(col < 0)){
		return false;
	    }}
	if (dx < 0){
	    if ((col - w.length() < -1 ) ||
		(col > board[0].length - 1) ||
		(col < 0)){
		return false;
	    }}
	if (dy > 0){
	    if ((w.length() + row > board.length) ||
		(row > board.length - 1) ||
		(row < 0)){
		return false;
	    }}
	if (dy < 0){
	    if ((row - w.length() < -1) ||
		(row > board.length - 1) ||
		(row < 0)){
		return false;
	    }}
	
	return true;
    }
	
    public boolean addWordGeneral(String w, int row, int col, int dy, int dx){
	int c = col;
	int r = row;
        if (generalErrorCheck(w, row, col, dy, dx)){
	   
	    if (!(overlapGeneral(w, row, col, dy, dx))){   //overlap false means good to go
		for (int i=0; i < w.length();i++){
		    board[r][c] = w.charAt(i);
		    c = c + dx;
		    r = r + dy;
		    
		}
		return true;
	    }
	}
	return false;
    }


    public void buildPuzzle(int numwords){
	for (int i=0;i<numwords;i++){
	    int wordIndex = r.nextInt(wordList.size());
	    String w = wordList.get(wordIndex);
	    if (addWordGeneral(w)){
		words.add(w);
		wordList.remove(wordIndex);

    public boolean addWord(String w){
        int dy = -1 + r.nextInt(3);
	int dx = -1 + r.nextInt(3);
	if (dx == 0 && dy == 0){
	    return false;
	}
	
	return true;
    }
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
     	//System.out.println(w);
	w.addWordGeneral("hello",15,35,1,1); // should work
	w.addWordGeneral("hello",15,4,-1,0); // should work
	w.addWordGeneral("hell0",15,3,1,-1); // should work
	w.addWordGeneral("llllllllllllllll",18,25,0,1); // should work overlap check works
	//	w.addWordGeneral("hello",6,6,1,1); // should work
	//	w.addWordHR("hello", 0,15);
        
	//w.addWordV("dASDASDD" ,0 , 4234324);      illegal column test. 
	//	w.addWord("lo000");
	//	System.out.println(w.generalErrorCheck("llafa", 4, 23, -1, -1));
	System.out.println(w);
	//System.out.println(w.board.length);
	//System.out.println(w.board[0].length);
	
    }
}

