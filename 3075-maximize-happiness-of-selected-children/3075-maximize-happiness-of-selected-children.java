class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length-1;
        long happy=0;
        long sum=0;
        for(int i=n;i>n-k;i--){
             
             if(i==n){
                
                happy=happiness[i];
                }
             else if(i<n){
               happy=(happiness[i]-n)+i;
         
                   if(happy<0){
                break;
             }
             }
             sum+=happy;
        }
        return sum;
    }
}