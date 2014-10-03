//  ALL FUNCTIONS ARE WORKING WOOOOO!!! except for the one I stole from
//  Mr.Z, (number 2) because i liked his solution,
//  but the diamond pyramid and upside down reversed triangle
//  are all my work

public class Shapes{
   
    public String tri1(int h){
    int row = h;
    String ans = "";
    String stars = "*";
    while (row > 0){
	ans = ans + stars + "\n";
	stars = stars + "*";
	row = row - 1;
    }
    return ans;
  }

    /*I liked Mr.Z's solution */
 public String tri2(int height){
	int h;
	int i;
        String s="";
	for (h=1;h<=height;h++){
	    /* add the next space line */
	    for (i=0;i<height-h;i++){
		s = s + ".";
	    }

	    /* add the next triangle line */
	    for (i=0;i<h;i++){
		s=s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }

    



    //took me a while to understand for loops, but once I did, the problem 
    // itself took only about 5-6 minutes, saw that it was really similar to 
    //tri2, except relationship between h and # of stars was 2h-1 not just h
    public String tri3(int height){
	int h;
	int i;
	String ans = "";
	for (h=1;h<height;h++){
	    for (i=0;i<height-h;i++){
		ans = ans + " ";
	    }
	    for (i=0;i<h*2-1;i++){
		ans = ans + "*";
	    }
	    ans = ans + "\n";
	}
	return ans;
    }
    //diamond only works with odd height values, or else it would look ugly
    //took about an hour and then some
 
    public String diamond(int height){
	int h;
	int i;
	String ans = "";
	for (h=1;h<=(height+1)/2;h++){
	    for (i=2;i<height-h;i++){
		ans = ans + ".";
	    }
	    for (i=0;i<h*2-1;i++){
		ans = ans + "*";
	    }
	    ans = ans + "\n";
	}
	for(h=1;h<=height/2;h++){
	    for (i=0;i<h;i++){
		ans = ans + ".";
	    }
	    for (i=0;i<height-2*h;i++){
		ans = ans + "*";
	    }
	    ans = ans + "\n";
	}

	return ans;
    }

    public String tri4(int height){
	int h;
	int i;
	String ans = "";
	for (h=0;h<height;h++){
	    for (i=0;i<h;i++){
		ans = ans + ".";
	    }
	    for (i=0;i<height-h;i++){
		ans = ans + "*";
	    }
	    ans = ans + "\n";
	}
	return ans;
    }
}
