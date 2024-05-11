class Solution {
    public int removeDuplicates(int[] nums) {
        int j=2;
        for(int i=2;i<nums.length;i++){
            nums[j]=nums[i];
            if(nums[i]!=nums[j-2]){
                j++;
            }
        }
        return j;
    }
}