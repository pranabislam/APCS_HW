import java.util.*;

public class orderedsarray extends Sarray {
    

    public orderedsarray() {
        super();
    }
  
    public boolean addOrdered(String s){
        if (last == data.length-1){
	    super.makeBigger(data, 20);
	    super.getdata[last+1] = i;
	}

	else {
	    data[last +1] = i;
	}
	last++;
	return true;
    }
	// adds an item to the end of the list, grow if needed
        // returns true


    public String compareWords(String s, String r){
	if (s.length() <= r.length()){
	    for (int i = 0; i < s.length(); i++){
		if (s.substring(i, i+1).compareTo(r.substring(i, i+1)) < 0){
		    return s;
		}
		if (s.substring(i, i+1).compareTo(r.substring(i, i+1)) > 0){
		    return r;
		}
		else return s; //if its the same word, then just return s
	    }
	}
	if (s.length() >= r.length()){
	    for (int i = 0; i < r.length(); i++){
		if (s.substring(i, i+1).compareTo(r.substring(i, i+1)) < 0){
		    return s;
		}
		if (s.substring(i, i+1).compareTo(r.substring(i, i+1)) > 0){
		    return r;
		}
		else return s; //if its the same word, then just return s
	    }
	}
    }
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
