public int[] frontPiece(int[] nums) {
  int[] ans = new int[2];
  if (nums.length <  3) {
  return nums;
  }
  ans[0] = nums[0];
  ans[1] = nums[1];
  return ans;
}


public int sum13(int[] nums) {
int sum =0;
  for (int i = 0;i <nums.length ;i++)
  {
  if (nums[i] != 13)
  sum = sum + nums[i];
  else if (nums[i] == 13 && i < nums.length -1 ) {
  nums[i] = 0;
  nums[i+1] = 0; 
  }
  }
  return sum;
}
