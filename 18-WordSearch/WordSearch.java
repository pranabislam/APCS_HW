public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
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
		
	    
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
     	//System.out.println(w);
	w.addWordH("hello",0,15); // should work
	// w.addWordH("zzzzzzz",3,14); // test illegal overlap
	//w.addWordH("look",3,18); // test legal overlap
	//w.addWordH("look",-3,20); // test illegal row
	//w.addWordH("look",3,55); // test illegal col
	
	//	System.out.println(w.board[0]);
	//	System.out.println(w.board.length);

	w.addWordV("hueheu", 0, 15);
	//w.addWordV("dASDASDD" ,0 , 4234324);      illegal column test. 
	System.out.println(w);
    }
}
