import java.io.*;
import java.util.*;

public class Cowboy extends Basechar implements Comparable{
    // Cowboy-specific variables
    private int ammo;
    private Cowboy[] boyz = new Cowboy[10];
    /* Cowboy a = new Cowboy();
    Cowboy b = new Cowboy();
    Cowboy c = new Cowboy();
    Cowboy d = new Cowboy();
    Cowboy e = new Cowboy();
    boyz[0] = a;
    boyz[1] = b;
    boyz[2] = c;
    boyz[3] = d;
    boyz[4] = e;  */
    Random r = new Random();
    
    // constructors
    public Cowboy() {
	super();
	this.setAmmo();
	for (int i = 0; i < 10; i++){
	    boyz[i] = new Cowboy();
	}
	    
    }
    public Cowboy(String name) {
        super(name, 100, 25, 15, 15, 40, 25);
        this.setAmmo();
	    
    }
    
    
    // setters 'n' getters
    public void setAmmo() {
        this.ammo = r.nextInt(10);
    }
    
    public String getName(){
	return super.toString();
    }
    
    public int compareTo(Object other){
	Cowboy c = (Cowboy)other;
	return this.ammo - c.ammo;
    }



    // ATTACKS
    public int shot(Basechar other) {
    	if(this.getEP() >= 5) {
            this.addEP(-5);
            this.ammo -= 1;
	    int dmg = 10;
	    other.addHP(-1*dmg);
            return dmg;
    	}
	    return -1;
    }
    
    public int doubleShot(Basechar other) {
    	if(this.getEP() >= 10) {
        	this.addEP(-10);
        	this.ammo -= 2;
		int dmg = 20;
		other.addHP(-1*dmg);
        	return dmg;
    	}
        return -1;
    }
    
    public int bangBangAttack(Basechar other) {
    	if (this.getEP() >= 24) {
        	this.addEP(-24);
        	this.ammo = 0;
		int dmg = 50;
		other.addHP(-1*dmg);
        	return dmg;
    	}
        return -1;
    }


    public String toString(){
	String ans = "[";
	
	for (int i = 0; i < boyz.length; i++){
	    ans = ans + boyz[i];
	}
	ans += "]";
	return ans;
    }
	    
    public static void main(String[] args){
	Cowboy pop = new Cowboy();
	    System.out.println(pop);
	    }



}
