
public class Greeter {

    
    
    private String greeting;

   
    
    public Greeter(String s) {
	System.out.println("In the constructor w/String");
	greeting = s;
    }

    public Greeter() {
	System.out.println("In the constructor w/zero params");
	greeting = "Hello world!"; // this can be done instead of new String("Hello world!")
	
    }

   
    
    /* The word after public defines the return type of the method.
       In this case, we are returning a String value. If we don't want to 
       return any value, we use the special type "void"
    */
    public String getGreeting() {
	return greeting;
    }
    
    public void setGreeting(String s){
	greeting  = s;
    }
    public String greet() {
	// uncomment the following line for question 2
	// String greeting = new String("Sup!");
	return greeting;
    }

    public void ungreet() {
	System.out.println(greeting);
    }
}
