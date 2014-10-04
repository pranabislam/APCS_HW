public class Frame{
    public String Frame(int a,int b){
	String g = line("*",b);
	String ans = g + "\n";
	String mid = "*" + line(" ", b - 2) + "*" + "\n";
	int i;
	for (i=0;i<a-2;i++){
	    ans = ans + mid;
	}
	ans = ans + g;
	return ans;
    }
	    
	    

public String stringSplosion(String str){
    String ans = "";
    int i;
    for(i=str.length();i>0;i--){
	ans = str.substring(0,i) + ans;
    }
    return ans;
}

 public String line(String c, int n){
	String s = "";
	for (int i=0;i<n;i++){
	    s=s+c;
	}
	return s;
    }

public String stringX(String str){
    String ans = "";
    int i;
    for (i=0; i<str.length(); i++){
	if (!(i>0 && i<(str.length()-1) && str.substring(i, i+1).equals("x"))){
	    ans = ans + str.substring(i,i+1);
	}
    }
    return ans;
}



}