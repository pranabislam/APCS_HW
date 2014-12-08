import java.io.*;
import java.util.*;

class Sorts {
    int[] data;
    int[] copy;
    int[] backwards;
    
    Random r;
    public Sorts(int n){
	r = new Random();
	data = new int[n];
	copy = new int[n];
	backwards = new int[n];
	fill();

				
    }

    public Sorts() {
	this(100);
    }

    public void fill(){
	for (int i = 0; i < data.length; i++) {
	    data[i]=r.nextInt(100);
	}
    }

    public void backup() {
	for (int i = 0; i < data.length; i++) {
	    copy[i] = data[i];
	}
    }
    public void restore() {
	for (int i = 0; i < data.length; i++) {
	    data[i] = copy[i];
	}
    }
    public void backwards(){
	isort();
	int count = 0;
	for (int i = data.length-1; i >= 0; i--){
	    backwards[count] = data[i];
	    count++;

	}
	for (int i = 0; i<data.length;i++){
	    data[i] = backwards[i];
	}}
	

    public void isort() {
	int i,j;
	for (i = 1; i < data.length; i++) {
	    int tmp=data[i];
	    for (j=i-1 ; j >= 0 && tmp < data[j];j--) {
		data[j+1]=data[j];
	    }
	    data[j+1]=tmp;
	}
    }


    public void ssort() {
	int i,j;
	int mi;
	for ( i = 0; i < data.length-1; i++) {
	    mi = i;
	    for (j=i+1;j<data.length;j++) {
		if (data[j]<data[mi]){
		    mi=j;
		}
	    }
	    int tmp=data[mi];
	    data[mi]=data[i];
	    data[i]=tmp;

	}

    }

    public void builtin() {
	/* This assumes the array is full (no null elements) If you
	   want to sort only part of the array use:
	   Arrays.sort(data,start,stop) which will sort from start
	   (inclusive) to stop (exclusive).

	   Also, ArrayLists have Collections.sort(list)

	*/
	Arrays.sort(data);
    }

    public String toString() {
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    s = s+data[i]+" ";
	}
	return s;
    }
    public static void main(String[] args) {
	Sorts s = new Sorts();
	//	System.out.println(s);
	s.backwards();
	//System.out.println(s);

	double start = System.nanoTime();
	s.ssort();
	double end = System.nanoTime();
	double time = end - start;

	double start1 = System.nanoTime();
	s.isort();
	double end1 = System.nanoTime();
	double time1 = end1 - start1;
	
	double start2 = System.nanoTime();
	s.builtin();
	double end2 = System.nanoTime();
	double time2 = end2 - start2;

	System.out.println("\n");
	System.out.println(time);
	System.out.println("\n");
	System.out.println(time1);
	System.out.println("\n");
	System.out.println(time2);
	System.out.println("\n");
	
	
	//System.out.println(s);
    }
}
