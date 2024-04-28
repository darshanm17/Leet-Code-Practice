class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            if((numbers[left]+numbers[right])<target){
                left++;
            }
            else if((numbers[left]+numbers[right])>target){
                right--;
            }
            else{
                ans[0]=left+1;
                ans[1]=right+1;
                break;
            }
        }
        return ans;
    }
}/*int[] ans=new int[2];
     int n=numbers.length;
     int left=0;
     int right=n-1;
     
     while(left<right){
        if((numbers[left]+numbers[right])>target){
            right--;
        }
        else if((numbers[left]+numbers[left])<target){
            left++;
        }
        else{
            ans[0] = left+1;
            ans[1] = right+1;
           break;
        }
     }
     return ans;
    */