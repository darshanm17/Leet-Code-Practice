class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length!=1){
        int n=nums.length-1;
        int[] temp=new int[k];
        k%=nums.length;
      
        int j=0;
       for(int i=n-k+1;i<=n;i++){
          
           temp[j]=nums[i];
           j++;
       }
       System.out.print(Arrays.toString(temp));
     for(int i=n-k;i>=0;i--){
         nums[i+k]=nums[i];
     }
     for(int i=0;i<k;i++){
         nums[i]=temp[i];
     }
       }}
    
           
    
    }
