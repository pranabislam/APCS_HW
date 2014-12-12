import java.io.*;
import java.util.*;

public class Searching implements Comparable{
    private Comparable[] a;
    Random r = new Random();

    public Searching(){
	this(10);
	for (int i = 0; i < a.length; i++){
	    a[i] = r.nextInt(100);
	}
    }

    public Searching(int n){
	a = new Comparable[n];
    }
    //doing this with ints
    public void additem(Comparable q, int index){
	a[index] = q;
    }

    public void naturalsort(){
	Arrays.sort(a);
    }

    public Comparable lsearch(Comparable item){
	for (int i = 0; i < a.length;i++){
	    if (a[i].compareTo(item) = 0){
		return item;
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable item){
	int low = 0;
	int high = a.length;
	while (low < high){
	    int middle = (low + high)/2;
	    if (a[middle].compareTo(item) == 0){
		return a[middle];
	    }
	    if (a[middle].compareTo(item) > 0){
		high = middle - 1;
	    }
	    if (a[middle].compareTo(item) < 0){
		low = middle + 1;
	    }
	}
	    
	return null;
    }
    

    public Comparable rbsearch(Comparable lml, int low, int high){
	if (low > high){
	    return null
		}
	int middle = (low + high)/2;
	if (a[middle].compareTo(lml) == 0){
	    return a[middle];
	}
	else if (a[middle].compareTo(lml) < 0){
	    return rbsearch(lml, middle + 1, high);
	}
	else 
	    return rbsearch(lml, low, middle - 1);
    
    }

    public static void main(String[] args){

	Searching q = new Searching();
	q.naturalsort();
	
	
	
    }
}
