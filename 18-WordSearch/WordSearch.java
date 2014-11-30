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
	wordList.add("Money");
	wordList.add("Mo");
	wordList.add("hk");
	wordList.add("lel");
	wordList.add("zo");
	wordList.add("let");
	wordList.add("e");
	wordList.add("ol");
	wordList.add("has");
	wordList.add("ssj");
	wordList.add("sd");
	wordList.add("l0");
	
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


    public String getKey(){
	String s = "";
	for (int i = 0; i < key.length; i++) {
	    for (int j = 0; j < key[i].length; j++) {
		s = s + key[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    private void makeKey() {
	key = new char[board.length][board[0].length];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		key[i][j]=board[i][j];
	    }
	}
    }

    public void buildPuzzle(int numwords){
	int i = 0;
	while (i < numwords){
	    int wordIndex = r.nextInt(wordList.size());
	    /*  System.out.println(r.nextInt(1));
	    System.out.println(wordIndex);
	    System.out.println(words);
	    System.out.println(wordList);*/
	    String w = wordList.get(wordIndex); 
	    if (addWordRand(w)){
		words.add(w);
		wordList.remove(wordIndex);
		i++;
	    }}
	makeKey();
	
	for(int z = 0; z < board.length; z++){
	    for (int qq = 0; qq < board[0].length; qq++){
		if (board[z][qq] == '.'){
		    String alphabet = "abcdefghijklmnopqrstuvwxyz";
		    board[z][qq] = alphabet.charAt(r.nextInt(alphabet.length()));
		    }}}}
		   
		    

    public boolean addWordRand(String lala){
        int horiz = -1 + r.nextInt(3);
	int vert = -1 + r.nextInt(3);
	int rownum = r.nextInt(board.length);
	int colnum = r.nextInt(board[0].length);
	if (horiz == 0 && vert == 0){
	    return false;
	}
	
	
	return addWordGeneral(lala, rownum, colnum, vert, horiz);
    }
    
    public String getWords(){
	return ""+words;
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
     	//System.out.println(w);
	//w.addWordGeneral("hello",15,35,1,1); // should work
	//	w.addWordGeneral("hello",15,4,-1,0); // should work
	
	//w.addWordGeneral("llllllllllllll",18,25,0,1); // should work
	//	w.addWordRand("Pra");
	/*	w.addWordRand("lalalala");
	w.addWordRand("lla");
	w.addWordRand("l333a");
	w.addWordRand("ldddd");
	w.addWordRand("lfffa"); */
	w.buildPuzzle(10);
	System.out.println(w.getKey());
	System.out.println(w);
	//System.out.println(w.board.length);
	//System.out.println(w.board[0].length);
	
    }
}

