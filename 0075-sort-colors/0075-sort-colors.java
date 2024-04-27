class Solution {
    public void sortColors(int[] nums) {
     for(int i=0;i<nums.length;i++){
        int curr=i;
        int last=nums.length-1;
        while(curr<=last){
            if(nums[curr]>nums[last]){
                int temp=nums[last];
                nums[last]=nums[curr];
                nums[curr]=temp;
            }
            last--;
        }
     }
     System.out.println(Arrays.toString(nums));
        
    }
}