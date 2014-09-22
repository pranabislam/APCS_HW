public class Driver { 
    public static void main(String[] args) {
	System.out.println(mixStart("pixxy"));
	System.out.println(mixStart("3231dsdq"));
	System.out.println(makeOutWord("<<>>", "huhu"));
	System.out.println(firstHalf("yaaaaahuuu"));
    }

        public static boolean mixStart(String str) {
	    if (str.length() < 3){
		return false;
	    }
	    if (str.substring(1,3).equals("ix")){
		return true;
	    }
	    return false;
	
	}
    public static String makeOutWord(String out, String word) {
	String combined = out.substring(0,2) + word + out.substring(2,4);
	return combined;
    }
    public static String firstHalf(String str) {
	String half = str.substring(0,str.length()/2);
	return half;
    }
}