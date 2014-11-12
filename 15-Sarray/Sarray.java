import java.util.*;

public class Sarray {
    int[] data;
    int   last;

    public Sarray() {
	data = new int[6];
	data[0] = 2;
	data[1] = 5;
	data[2] = 43;
	data[3] = 231;
	data[4] = 2029;
	data[5] = 1111;
	last = 5;
    }
    public boolean add(int i){
        if (last == data.length-1){
	    makeBigger(data, 20);
	    data[last+1] = i;
	}

	else {
	    data[last +1] = i;
	}
	last++;
	return true;
    }
	// adds an item to the end of the list, grow if needed
        // returns true


    public void  add(int index, int i){
       	if (index > last + 1){
	    throw new ArrayIndexOutOfBoundsException();
	}
	if (last == data.length -1){
	    makeBigger(data, 20);
	    }
	for (int g = last; g >= index; g--){
		data[g+1] = data[g];
	}
	    data[index] = i;
	    last++;
    }
	   
	    
	// adds item i  at index, shifting everything down as needed.
        // also grows as needed 
    

    public int size() {
	return last + 1;
	    
	// returns the number of items in the list (not the array size)
    }

    public int get(int index) {
        return data[index];
	    
       

        // returns the item at location index of the lsit
    }

    public int set(int index, int i){
        int oldvalue = data[index];
	data[index] = i;
	return oldvalue;
	    
	// sets the item at location index to value i
        // returns the old value. 
    }

    public int remove(int index){
	int oldvalue = data[index];
        for (int i = index;i<=last;i++){
	    data[i] = data[i+1];
	}
	if (index == last){
	    last--;
	}
	if (index > last){
	    throw new ArrayIndexOutOfBoundsException();
	}
	return oldvalue;
	// removes the item at index i
        // returns the old value
    }
    public void makeBigger(int[] before, int numSpaces){
	int[] longer = new int[data.length + numSpaces];
	System.arraycopy(data,0,longer,0,data.length);
	data = new int[longer.length];
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
