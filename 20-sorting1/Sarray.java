import java.util.*;

public class Sarray {
    private String[] data;
    private int last;
    Random r = new Random();

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

    
    public Sarray(int num){
	data = new String[num];
	for (int i = 0; i < num; i++){
	    String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    int randdy = r.nextInt(26);
	    data[i] = alphabet.substring(randdy, randdy+1);
	    
	}
	last = num - 1;
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
  
    //insertion sort
    public void isort(){
	String current;
	for (int i = 0; i <= last; i++){
	    int j;
	    current = data[i];
	    for (j = i; j > 0 && current.compareTo(data[j-1]) < 0; j--) {
		data[j] = data[j-1];    
	    }
	    data[j] = current;
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
    
   

    public void ssort1(){
	for (int i = 0; i < last; i++){
	    int index = i;
	    for (int j = i + 1; j <= last; j++)
		if (data[j].compareTo(data[index]) < 0) 
		    index = j;
	    String smaller = data[index];  
	    data[index] = data[i];
	    data[i] = smaller;
	}
    }

    /*my myopic attempt at trying this a weird way that ultimately ending in failure 
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
	    //System.out.println(printArray() + "\n");
	    count++;
	}}
    */

    public static void main(String[] args){
	Sarray w = new Sarray(1000);
	//w.insertOrdered("bbbbbbbbbbbbz");
	//	System.out.println("fasdf");
	//System.out.println(w.MinString(0));
	//	w.ssort();
	//w.isort();
	//System.out.println(indexOf(MinString(0)));
	double start = System.nanoTime();
	w.ssort1();
	double end = System.nanoTime();
	double time = end - start;

	double start1 = System.nanoTime();
	w.isort();
	double end1 = System.nanoTime();
	double time1 = end1 - start1;
	System.out.println("\n");
	System.out.println(time);
	System.out.println("\n");
	System.out.println(time1);
	System.out.println("\n");
	//System.out.println(w.printArray());
    }





}

    
