import java.io.*;
import java.util.*;

public class WordSearch {
    private char[][] board;
    Random r = new Random();

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

    public boolean overlapHorizontal(String w, int row, int col){
	int i = 0;
	int c = col;
	while (i < w.length()){
	    if ((w.charAt(i) == board[row][c])||
		(board[row][c] == '.')){
		i++;
		c++;
	    }
	    else {
		return true;
	    }
	}
	return false;
    }

        public boolean overlapHorizontalR(String w, int row, int col){
	int i = 0;
	int c = col;
	while (i < w.length()){
	    if ((w.charAt(i) == board[row][c])||
		(board[row][c] == '.')){
		i++;
		c--;
	    }
	    else {
		return true;
	    }
	}
	return false;
    }
     
     
    public boolean overlapVertical(String w, int row, int col){
	int i = 0;
	int r = row;
	while (i <w.length()){
	    if ((w.charAt(i) == board[r][col])|| (board[r][col] == '.')){
		i++;
		r++;
	    }
	    else {
		return true; } }
	return false;
    }
    
        public boolean overlapVerticalR(String w, int row, int col){
	int i = 0;
	int r = row;
	while (i <w.length()){
	    if ((w.charAt(i) == board[r][col])|| (board[r][col] == '.')){
		i++;
		r--;
	    }
	    else {
		return true; } }
	return false;
    }
    
    public boolean overlapDiagonalSE(String w, int row, int col){
	int i = 0;
	int r = row;
	int c = col;
	while (i <w.length()){
	    if ((w.charAt(i) == board[r][c])|| (board[r][c] == '.')){
		i++;
		r++;
		c++;
	    }
	    else {
		return true; } }
	return false;
    }
	    
    public boolean overlapDiagonalNE(String w, int row, int col){
	int i = 0;
	int r = row;
	int c = col;
	while (i <w.length()){
	    if ((w.charAt(i) == board[r][c])|| (board[r][c] == '.')){
		i++;
		r--;
		c++;
	    }
	    else {
		return true; } }
	return false;
    }	

        public boolean overlapDiagonalNW(String w, int row, int col){
	int i = 0;
	int r = row;
	int c = col;
	while (i <w.length()){
	    if ((w.charAt(i) == board[r][c])|| (board[r][c] == '.')){
		i++;
		r--;
		c--;
	    }
	    else {
		return true; } }
	return false;
    }

        public boolean overlapDiagonalSW(String w, int row, int col){
	int i = 0;
	int r = row;
	int c = col;
	while (i <w.length()){
	    if ((w.charAt(i) == board[r][c])|| (board[r][c] == '.')){
		i++;
		r++;
		c--;
	    }
	    else {
		return true; } }
	return false;
    }
    
    public void addWordH(String w, int row, int col){
	int c = col;
        if ((w.length() + c <= board[0].length)   //word must fit in the board
	    && (w.length() + col >= 0)&&
	    (row >= 0 && row < board.length)){   //illegal column and row stop
	    if (!(overlapHorizontal(w, row, col))){   //overlap false means good to go
		for (int i=0; i < w.length();i++){
		    board[row][c] = w.charAt(i);
		    c++;
		}
	    }
	}
    }

    public void addWordHR(String w, int row, int col){
	int c = col;
        if ((c - w.length() > 0)   //word must fit in the board
	    && (w.length() + col >= 0)&&
	    (row >= 0 && row < board.length)){   //illegal column and row stop
	    if (!(overlapHorizontalR(w, row, col))){   //overlap false means good to go
		for (int i=0; i < w.length();i++){
		    board[row][c] = w.charAt(i);
		    c--;
		}
	    }
	}
    }
  
    
    public void addWordV(String w, int row, int col){
	int r = row;
	if ((w.length() + r <=board.length) &&  //cant go beyond the rows
	    (w.length() + row >= 0)&&   
	    (col >= 0 && col < board.length)){  // illegal column and row stopper
	    if (!(overlapVertical(w,row,col))){
		for (int k = 0; k < w.length(); k++){
		    board[r][col] = w.charAt(k);
		    r++;
		}}}}

   public void addWordVR(String w, int row, int col){
	int r = row;
	if (r - w.length() > 0) {    
	    /* &&  //cant go beyond the rows
	    (w.length() + row >= 0)&&   
	    (col >= 0 && col < board.length)){  // illegal column and row stopper */
	    if (!(overlapVerticalR(w,row,col))){
		for (int k = 0; k < w.length(); k++){
		    board[r][col] = w.charAt(k);
		    r--;
		}}}}
		
	    
    public void addWordDSE(String w, int row, int col){
	int r = row;
	int c = col;
       	if (w.length() + r <=board.length || w.length() + c <= board[0].length){
	    if (!(overlapDiagonalSE(w,row,col))){
		    for (int ff = 0; ff <w.length(); ff++){
			board[r][c] = w.charAt(ff);
			r++;
			c++;
		    }
		}
	}
    }
	

    public void addWordDNE(String w, int row, int col){
	int r = row;
	int c = col;
       	if (r - w.length() > 0 || w.length() + c <= board[0].length){
	    if (!(overlapDiagonalNE(w,row,col))){
		    for (int ff = 0; ff <w.length(); ff++){
			board[r][c] = w.charAt(ff);
			r--;
			c++;
		    }
		}
	}
    }

    public void addWordDNW(String w, int row, int col){
	int r = row;
	int c = col;
       	if (r - w.length() > 0 || c - w.length() > 0){
	    if (!(overlapDiagonalNW(w,row,col))){
		    for (int ff = 0; ff <w.length(); ff++){
			board[r][c] = w.charAt(ff);
			r--;
			c--;
		    }
		}
	}
    }
	


    public void addWordDSW(String w, int row, int col){
	int r = row;
	int c = col;
       	if (w.length() + r <=board.length || c - w.length() > 0){
	    if (!(overlapDiagonalNW(w,row,col))){
		    for (int ff = 0; ff <w.length(); ff++){
			board[r][c] = w.charAt(ff);
			r++;
			c--;
		    }
		}
	}
    }		
	    
	    /*	if ((w.length() + r <=board.length) &&  //cant go beyond the rows
	    (w.length() + row >= 0)&&   
	    (col >= 0 && col < board.length)){  // illegal column and row stopper
	    if (!(overlapVertical(w,row,col))){
		for (int k = 0; k < w.length(); k++){
		    board[r][col] = w.charAt(k);
		    r++;
		    }}}}*/


    public boolean addWord(String w){
	int value  = r.nextInt(8);
	int randrow = r.nextInt(20);
	int randcol = r.nextInt(40);
	if (value == 0){
	    addWordH(w,randrow,randcol);
	    if (!overlapHorizontal(w,randrow, randcol)){
		return true;
	    }
	}
	if (value == 1){
	    addWordHR(w,randrow,randcol);
	    if (!overlapHorizontalR(w,randrow, randcol)){
		return true;
	    }
	}
	if (value == 2){
	    addWordV(w,randrow,randcol);
	    if (!overlapVertical(w,randrow, randcol)){
		return true;
	    }
	}
	if (value == 3){
	    addWordVR(w,randrow,randcol);
	    if (!overlapVerticalR(w,randrow, randcol)){
		return true;
	    }
	}
	if (value == 4){
	    addWordDNE(w,randrow,randcol);
	    if (!overlapDiagonalNE(w,randrow, randcol)){
		return true;
	    }
	}
	if (value == 5){
	    addWordDNW(w,randrow,randcol);
	    if (!overlapDiagonalNW(w,randrow, randcol)){
		return true;
	    }
	}
	if (value == 6){
	    addWordDSE(w,randrow,randcol);
	    if (!overlapDiagonalSE(w,randrow, randcol)){
		return true;
	    }
	}
	if (value == 7){
	    addWordDSW(w,randrow,randcol);
	    if (!overlapDiagonalSW(w,randrow, randcol)){
		return true;
	    }
	}
	return false;
    }




 
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
     	//System.out.println(w);
	w.addWordH("hello",0,15); // should work
	w.addWordHR("hello", 0,15);
	// w.addWordH("zzzzzzz",3,14); // test illegal overlap
	//w.addWordH("look",3,18); // test legal overlap
	//w.addWordH("look",-3,20); // test illegal row
	//w.addWordH("look",3,55); // test illegal col
	
	//	System.out.println(w.board[0]);
	//	System.out.println(w.board.length);

	w.addWordVR("hueheu", 15, 3);
	/*	w.addWordDSE("halal", 0, 15);
	w.addWordDSE("uuuh", 14, 10); //tests illegal overlap
	w.addWordDSW("djjh", 10, 10); //tests illegal overlap
	w.addWordDNW("djjjh", 10, 10); //tests illegal overlap
	w.addWordDNE("FHH", 10, 10); //tests illegal overlap
	w.addWordDNE("dfd", 10, 10); //tests illegal overlap
	*/
	//w.addWordV("dASDASDD" ,0 , 4234324);      illegal column test. 
	w.addWord("lo000");
	System.out.println(w);
    }
}

