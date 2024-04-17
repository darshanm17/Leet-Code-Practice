class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int min_diff=Integer.MAX_VALUE;
        int ressum=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return target;
                }
             if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
                int diff=Math.abs(target-sum);
             
             
               if(min_diff>diff){
                   min_diff=diff;
                   ressum=sum;
               }
            }
        }
        return ressum;
    }
}