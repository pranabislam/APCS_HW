import java.util.*;

public class Sarray {
    private String[] data;
    private int last;

    public Sarray() {
	data = new String[10];
	data[0] = "Neutron";
	data[1] = "Simpleton";
	data[2] = "Aardvark";
	data[3] = "Cool";
	data[4] = "Elephant";
	data[5] = "Zyzz";
	data[6] = "Jolly";
	last = 6;
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

	for (j = 0; j <= last; j++){  // skipping first value since cant be ordered
	    bingo = data[j];
	    for(i = j; (i > 0) && (bingo.compareTo(data[j]) < 0); i--){   // using the algorithm we did in class
		System.out.println(bingo);
		data[i] = data[i-1]; // shift if data[i] should be after data[j]
	    }
	    
	    data[i] = bingo;    // Put bingo in place
	}
    }



    //Selection Sort

    /*
       look at location 0
       find the smallest value between a[0] and the end 
       swap a[0] with a[index of smallest value]
       i++

     */

    public String MinString(int startIndex){   //start the search for min here
	String currentMin = data[startIndex];
	for (int i = startIndex; i<last; i++){
	    if ((data[i].compareTo(data[i+1]) < 0) && (data[i].compareTo(currentMin) < 0)){
		currentMin = data[i];
	    }}
	if (data[last].compareTo(currentMin)<0){
		currentMin = data[last];
	    }
	return currentMin;
    }
    public int indexOf(String bingo){
	for (int k = 0; k <= last; k++){
	    if (data[k].equals(bingo)){
		return k;
	    }
	}
	return -1;
    }
    // Works like a charm
    public void ssort(){
	String swapped;
	int count = 0;
	int index;
	System.out.println("Original Array: " + printArray()+"\n");
	for (int i = 0; i<=last; i++){
	    swapped = data[i];
	    index = indexOf(MinString(i)); //gets index of "Min" word
	    // System.out.println("index of min string:" + index);
	    // System.out.println("i value:" + i);
	    data[count] = MinString(i); //starting @ 0, sets min words 
	    data[index] = swapped; //set the value to whatever index
	    System.out.println(printArray() + "\n");
	    count++;
	}}


    public static void main(String[] args){
	Sarray w = new Sarray();
	//w.insertOrdered("bbbbbbbbbbbbz");
	//	System.out.println("fasdf");
	//System.out.println(w.MinString(0));
	w.ssort();
	System.out.println("Official printing");
	System.out.println(w.printArray());
    }





}

    
