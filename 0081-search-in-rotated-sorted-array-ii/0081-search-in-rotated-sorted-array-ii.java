class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
      
        while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            return true;
        }
        if(nums[left]==nums[mid]){
            left++;
            continue;
        }
        if(nums[mid]>nums[left]){
            if(nums[left]<=target && target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        else{
            if(nums[right]>=target && target>nums[mid]){
                left=mid+1;

            }
            else{
                right=mid-1;
            }
        }
        
        }
        return false;
    }
}