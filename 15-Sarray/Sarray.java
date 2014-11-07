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
	    
	// adds item i  at index, shifting everything down as needed.
        // also grows as needed 
    }

    public int size() {
        // returns the number of items in the list (not the array size)
    }

    public int get(int index) {
        // returns the item at location index of the lsit
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value. 
    }

    public int remove(int index){
        // removes the item at index i
        // returns the old value
    }
}
