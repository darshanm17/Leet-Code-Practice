class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        Arrays.sort(nums);
        int count=1;
        int max=1;
        nums=Arrays.stream(nums).distinct().toArray();
        for(int i=0;i<nums.length-1;i++){
        if(nums[i+1]-nums[i]==1){
            count++;
            max=Math.max(max,count);
        }
        else{
          
            count=1;
        }
          
        }
        return max;
    }
}