import java.util.*;

public class Arrayliststuff {
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    Random r = new Random();
    public Arrayliststuff(){
    for (int i = 1; i <= 20 ; i++){
	a1.add(i);
	
    }
    }
    public void randomizer(){
	for (int k = 0; k<a1.size(); k++){
	    int holder = a1.get(k);
	    a1.remove(k);
	    a1.add(r.nextInt(a1.size()), holder);
	}
	    System.out.println(a1);
	}
}

    
