class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        while(n>1){
            int a=n/2;
           matches+=a;
           
            //System.out.println(matches);
           n-=a; 
        
        }
        return matches;
    }
}