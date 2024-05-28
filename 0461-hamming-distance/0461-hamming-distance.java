class Solution {
    public int hammingDistance(int x, int y) {
     int ans=x^y;
     int c=0;
     while(ans!=0){
        ans=ans&(ans-1);
        System.out.println(ans);
        c++;
     }
     return c;
    }
}