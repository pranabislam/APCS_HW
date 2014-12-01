import java.util.*;

public class orderedsarray extends Sarray {
    

    public orderedsarray() {
        super();
    }
  
    /*   public boolean addOrdered(String s){
        if (super.getLast() == getData().length-1){
	    super.makeBigger(20);
	    getData()[super.getLast()+1] = s;
	}

	else {
	    getData()[super.getLast() +1] = s;
	}
	super.last = super.last + 1;
	return true;
	} */
	// adds an item to the end of the list, grow if needed
        // returns true

    public String[] getData(){
	return super.getData();
    }
    public String compareWords(String s, String r){
	if (s.length() <= r.length()){
	    for (int i = 0; i < s.length(); i++){
		if (s.substring(i, i+1).compareTo(r.substring(i, i+1)) < 0){
		    return s;
		}
		if (s.substring(i, i+1).compareTo(r.substring(i, i+1)) > 0){
		    return r;
		}
	    }
	    return s;
	    }
	if (s.length() >= r.length()){
	    for (int i = 0; i < r.length(); i++){
		if (s.substring(i, i+1).compareTo(r.substring(i, i+1)) < 0){
		    return s;
		}
		if (s.substring(i, i+1).compareTo(r.substring(i, i+1)) > 0){
		    return r;
		}
		
	    }
	    return r;
	}
	return "lamo";
    }

}




