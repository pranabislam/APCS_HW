import java.util.*;

public class Sarray {
    private String[] data;
    private int last;

    public Sarray() {
	data = new String[10];
	data[0] = "xba";
	data[1] = "zbbub";
	data[2] = "dccac";
	data[3] = "qduub";
	data[4] = "jelal";
	data[5] = "fihihi";
	last = 5;
    }
    public boolean add(String s){
        if (last == data.length-1){
	    makeBigger(20);
	    data[last+1] = s;
	}
	else {
	    data[last +1] = s;
	}
	last++;
	return true;
    }
	// adds an item to the end of the list, grow if needed
        // returns true


    public void  add(int index, String s){
       	if (index > last + 1){
	    throw new ArrayIndexOutOfBoundsException();
	}
	if (last == data.length -1){
	    makeBigger(20);
	    }
	for (int g = last; g >= index; g--){
		data[g+1] = data[g];
	}
	    data[index] = s;
	    last++;
    }
	   
	    
	// adds item i  at index, shifting everything down as needed.
        // also grows as needed 

    public int getLast(){
	return last;
    }

    public int size() {
	return last + 1;
	    
	// returns the number of items in the list (not the array size)
    }
    public String[] getData(){
	return data;
    }

    public String get(int index) {
        return data[index];
	    
        // returns the item at location index of the lsit
    }

    public String set(int index, String s){
        String oldstring = data[index];
	data[index] = s;
	return oldstring;
	    
	// sets the item at location index to value i
        // returns the old value. 
    }

    public String remove(int index){
	String oldstring = data[index];
        for (int i = index;i<=last;i++){
	    data[i] = data[i+1];
	}
	if (index == last){
	    last--;
	}
	if (index > last){
	    throw new ArrayIndexOutOfBoundsException();
	}
	return oldstring;
	// removes the item at index i
        // returns the old value
    }
    public void makeBigger(int numSpaces){
	String[] longer = new String[data.length + numSpaces];
	System.arraycopy(data,0,longer,0,data.length);
	data = new String[longer.length];
	System.arraycopy(longer, 0, data, 0, data.length);
    }
  
public String printArray(){
	String ans = "{";
	for (int i = 0; i < data.length; i++){
	    ans = ans + data[i] + ",";
	}
	ans = ans + "}";
	return ans;
    }
    //------------------------HOMEWORK 12/3/14-------------------//

    //Assuming array is in order, this will add the word in the correct spot
    public void insertOrdered(String newvalue){
	int i;
	for (i = last; i > 0 && newvalue.compareTo(data[i-1]) < 0 ; i--) {
	    data[i] = data[i-1];    
	}
	data[i]=newvalue;
    }
  

    public void isort(){
	int i;
	int j;
	String bingo;

	for (j = 1; j < last; j++){  // skipping first value since cant be ordered
	    bingo = data[j];
	    for(i = j - 1; (i > 0) && (data[i].compareTo(bingo) >= 0); i--){   // using the algorithm we did in class
		System.out.println(bingo);
		data[i] = data[i-1]; // shift if data[i] should be after data[j]
	    }
	    
	    data[i] = bingo;    // Put bingo in place
	}
    }


    public static void main(String[] args){
	Sarray w = new Sarray();
	w.insertOrdered("bbbbbbbbbbbbz");
	w.isort();
	System.out.println(w.printArray());
    }




}
