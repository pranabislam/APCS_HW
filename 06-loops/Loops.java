// took me about 15 minutes
public String frontTimes(String str, int n){
    String ans = "";
    if (str.length() > 2){
	while (n > 0){
	    ans = ans + str.substring(0,3);
	    n = n - 1;
	}
	return ans;
    }
    else {
	while ( n > 0 ) { 
	    ans = ans + str;
	    n = n - 1;
	}
	return ans; 
    }
}

// took me about 10 minutes

public String stringBits(String str){
    int n = str.length()/2;
    String ans = "";
    while (n > 0){
	ans = ans + str.substring(0,1);
	str = str.substring(2);
	n = n - 1;
	if (str.length() == 1){
	    ans = ans + str;
	}
    }
    return ans;
}

// this isn't working, at the moment. I'm confused on it. I'm not thinking straigh today, I have a headache. Took about 25 minutes

public String stringYak(String str){
    String ans = "";
    while (str.length() != 0){
	if (str.substring(0,1).equals("y")){
	    if (str.substring(1,2).equals("a")){
		if (str.substring(2,3).equals("k")){
		    str = str.substring(3);
		    ans = str;
		}
	    }
	}
	str = str.substring(1);
	ans = str.substring(1) + str;
    }
    return ans;
			    
}

//this one took me 15 minutes, and  friend looked over my code and saw the 
// mistake I made
public int stringMatch(String a, String b) {
    int count = 0;
    while ((a.length() > 1) && (b.length() > 1)) {
	if (a.substring(0,2).equals(b.substring(0,2))){
	    count = count + 1;
	}
	    a = a.substring(1);
	    b = b.substring(1);
	
    }
    return count;

}
