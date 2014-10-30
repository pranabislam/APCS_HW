//not working :(
/*public int sum67(int[] nums) {
  int count = 0;
  int sixplace;
  int sevenplace;
    for (int i = 0; i < nums.length; i++){
    count = nums[i] + count;
    if (nums[i] == 6){
    sixplace = i;
    break;
    }
    else {
    sixplace = nums.length;
    }
    }
    
    for (int k = sixplace; k < nums.length; k++){
    if ((nums[k] == 7) && (k > sixplace)){
       sevenplace = k;
       for (int q = sixplace; q< nums.length; q++){
       count = nums[q] + count;
       }
    }
    }
    }
    return count;
}   
*/    /// SCRAPPED THIS. WAY TOO COMPLICATED


//working

public int sum67(int[] nums) {
	int ans = 0;
	boolean count = true;
	if (nums.length == 0) {
	    return ans;
	}
	for (int i=0;i<nums.length;i++){
	    if (nums[i] == 6) {
		count = false;
	    }
	    if (count) {
		ans = ans + nums[i];
	    }
	    if (nums[i] == 7) {
		count = true;
	    }
 
	}
	return ans;
    }




//working!
public boolean more14(int[] nums) {
  int count1 =0;
  int count4 =0;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 1){
      count1 += 1;
      }
    if (nums[i] == 4){
      count4 += 1;
      }
    }
    if (count1 > count4){
      return true;
      }
    return false;
    
      
}


//working

 public int[] tenRun(int[] nums) {
	int[] ans;
	ans = new int[nums.length];
	boolean multiple = false;
	int multi = 0;
	for (int i=0; i<nums.length; i++){
	    if (multiple ==false){
		ans[i] = nums[i];
	    }
	    if (nums[i]%10 == 0){
		multiple = true;
		multi = nums[i];
	    }
	    if (multiple){
		ans[i] = multi;
	    }
	}
	return ans;
    }




    public boolean tripleUp(int[] nums) {
	int count = 0;
	for (int i=0; i<(nums.length-1); i++){
	    if ((nums[i] + 1) == nums[i+1]){
		count = count + 1;
	    }
	    if ((nums[i] + 1) != nums[i+1]){
		count = 0;
	    }
	    if (count == 2){
		return true;
	    }
    
	}
	return false;
    }




    public boolean tripleUp(int[] nums) {
	int count = 0;
	for (int i=0; i<(nums.length-1); i++){
	    if ((nums[i] + 1) == nums[i+1]){
		count = count + 1;
	    }
	    if ((nums[i] + 1) != nums[i+1]){
		count = 0;
	    }
	    if (count == 2){
		return true;
	    }
    
	}
	return false;
    }


    public boolean canBalance(int[] nums) {
	int left = 0;
   
	for (int i = 0; i < nums.length; i++) {
	    left += nums[i];
	    int right = 0;
	    for (int j = nums.length-1; j > i; j--) {
		right += nums[j];
	    }
	    if (right == left)
		return true;
	}
	return false;
    }



    public int[] seriesUp(int n) {
	int[] ans = new int[n * (n + 1) / 2];
	int pos = 0;
	for (int i=1; i <= n + 1; i++) {
	    for (int j = 1; j < i; j++) ans[pos++] = j;

	}
	return ans;
    }
