import java.util.*;

public class Sarray {
    private String[] data;
    private int last;

    public Sarray() {
	data = new String[10];
	data[0] = "a";
	data[1] = "b";
	data[2] = "c";
	data[3] = "d";
	data[4] = "e";
	data[5] = "f";
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


}
