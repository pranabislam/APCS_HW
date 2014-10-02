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
    
   
    //55 minutes still no solution.    
    public String tri2(int h){
	int spacesNum = h - 1;
	int rows = h;
	String stars = "*";
	String spaces = "";
	
	while (spacesNum > 0){
	    spaces = spaces + " ";
	    spacesNum = spacesNum - 1;
	    }
	String ans = spaces + stars;
	while (rows > 0){
	    
	    ans = ans.substring(1) + stars + "\n";
	    rows = rows - 1;
	    stars = stars + "*";
	}
	return ans;

    }
}