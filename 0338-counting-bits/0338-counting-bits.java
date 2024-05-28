class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
          ans[i]=checkOnes(i);
        }
        return ans;
    }
    private int checkOnes(int n){
        int temp=n,count=0;
        while(temp>0){
            int reminder=temp%2;
            if(reminder==1){
                count++;
            }
            temp/=2;
        }
        return count;
    }
}