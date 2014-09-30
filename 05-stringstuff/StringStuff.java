public class StringStuff {
    public static  String nonStart(String a, String b) {
	return a.substring(1) + b.substring(1);
    }

    public static String makeAbba(String a, String b) {
	return a + b + b + a;
    }

    public static int diff21(int n){
	if (n <= 21){
	    return 21-n;
	}
	else {
	    return (n - 21)*2;
	}
    }
}
