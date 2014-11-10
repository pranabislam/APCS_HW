import java.util.*;

public class Sarray {
    int[] data;
    int   last;

    public Sarray() {
	data = new int[20];
	data[0] = 2;
	data[1] = 5;
	data[2] = 43;
	last = 2;
    }

    public boolean add(int i){
        if (last == data.length-1){
	    int[] datanew = new int[data.length + 1];
	    for (int t = 0; t < data.length; t++){
		datanew[t] = data[t];
	    }
	    datanew[data.length] = i;
	}
	
	else {
	    data[last +1] = i;
	}
	return true;
    }
	// adds an item to the end of the list, grow if needed
        // returns true
    }

    public void  add(int index, int i){
        if (last == this.length -1){
	    int[] datanew = new int[this.length + 1];
	    for (int k = 0; k < index ; k++){
		datanew[k] = this[k];
	    }
	}
	else{
	    for (int g = last; g >= index; g--){
		this[g+1] = this[g];
	    }
	    this[index] = i;
	}
	    //I'm a bit confused as to how I should attempt to add 
	    // a value in a certain location. Also I didn't know if 
	    // making a new array and using that array was the right 
	    // approach. 
	    
	// adds item i  at index, shifting everything down as needed.
        // also grows as needed 
    }

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
        for (int i = index;i<last;i++){
	    this[i] = this[i+1];
	    last = last - 1;
	}
	return oldvalue;
	// removes the item at index i
        // returns the old value
    }
}
