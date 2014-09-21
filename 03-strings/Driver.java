public class Driver {
    public static void main(String[] args){
	String s = "pranab islam";
	int locationOfSpace = s.indexOf(" ");
	String firstName = s.substring(0,6);
	String lastName = s.substring(7);
	System.out.println(locationOfSpace);
        System.out.println(firstName);
	System.out.println(lastName);
    }
}