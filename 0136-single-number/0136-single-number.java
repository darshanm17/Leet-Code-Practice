class Solution {
    public int singleNumber(int[] nums) {
      int xorr=0;
      for(int i=0;i<nums.length;i++){
        xorr^=nums[i];
      }
      return xorr;
    }
}