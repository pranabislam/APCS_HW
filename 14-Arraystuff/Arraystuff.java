import java.util.*;

public class  Arraystuff {

    /*--------------------- Instance Variables --------------------*/ 

    private int[] a;
    Random rnd;

    /*--------------------- Constructors --------------------*/ 

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = rnd.nextInt(100);
	}
    }

    public Arraystuff(){
	this(100);
    }
    

    /*--------------------- Methods --------------------*/ 

    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;}


    public int find(int n){
	for (int i = 0; i < a.length; i++){
	    if (a[i] == n){
		return i;
	    }
	    
	}
	return -1;
    }
    

    public int maxVal(){
	int currentMax = a[0];
	for (int i = 0; i<a.length ;i++){
	    if (a[i] > currentMax){
		currentMax = a[i];
	    }
	}
        return currentMax;
    }

    public int freq(int n){
	int count = 0;
	int num = a[n];
	for (int k = 0 ; k < a.length; k++){
	    if (num == a[k]){
		count += 1;
	    }
	}
	return count;
    }

    public int mode(int[] A){
	int currentmode = -1;
	for (int i = 0; i<A.length; i++){
	    currentmode = A[i];
	    if ((freq(A[i])) >= (freq(currentmode))){
		    currentmode = A[i];
		}
	    
	}
	    return currentmode;
    }

    public int[] getArray() {
	return a;
    }
    /*--------------------- Main --------------------*/ 

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff(20);
	System.out.println(as);
	System.out.println(as.find(20));
	System.out.println(as.maxVal());
	System.out.println(as.mode(as.getArray()));
	
	
    }
    
}
