
public class Driver {
    public static void main(String[] args){
	Greeter g1 = new Greeter();
	Greeter g2 = new Greeter();
	System.out.println(g1.greet());
	System.out.println(g2.greet());
	
	// In java, we almost never make instance variables public so you can't do the following
        //g1.greeting = new String("Sup!");

	// instead we write public "accessor methods" --> get and set
	g1.setGreeting("Sup!");
	g2.setGreeting("randoml0l");
	//sets the greeting. then greet() returns greeting in the next lines
	System.out.println(g1.greet());
	System.out.println(g2.greet());
	g2.setGreeting("Hi Yawl!");
	//never changed g1 but chanegd g2 again by setting again. 
	System.out.println(g1.greet());
	System.out.println(g2.greet());

	String s = g1.getGreeting();
	System.out.println("g1's greeting is: "+ s);

	System.out.println("g2's greeting is: "+ g2.getGreeting());

	
    }
}
