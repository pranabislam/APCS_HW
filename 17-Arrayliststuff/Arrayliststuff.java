import java.util.*;

public class Arrayliststuff {
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    int[] a2 = new int[20];
    Random r = new Random();
    public Arrayliststuff(){
    for (int i = 1; i <= 20 ; i++){
	a1.add(i);
	a2[i-1] = i;
	
    }
    }
    public ArrayList<Integer> randomizer(){
	for (int k = 0; k<a1.size(); k++){
	    int holder = a1.get(k);
	    a1.remove(k);
	    a1.add(r.nextInt(a1.size()), holder);
	}
	return a1;
	}

    public int[] randomizer2(){
	for (int w = 0; w < a2.length; w++){
	    int rand = r.nextInt(a2.length);
	    int holder = a2[w];
	    int holder2 = a2[rand];
	    a2[w] = holder2;
	    a2[rand]=holder;
	}
	return a2;
    }
    public String getArray(){
	String ans = "";
	for (int d = 0; d < a2.length; d++){
	    ans = ans +  a2[d] + ",";
	}
	return ans;
    }
	
}


    
