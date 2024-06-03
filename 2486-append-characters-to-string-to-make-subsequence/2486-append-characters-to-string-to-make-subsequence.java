class Solution {
    public int appendCharacters(String s, String t) {
        int n=s.length();
        int m=t.length();
        int counts=0;
        int countt=0;
        int length=Math.max(n,m);
      while(counts<n && countt<m){
        if(s.charAt(counts)==t.charAt(countt)){
            countt++;
        }
    counts++;
      }
        
      return m-countt;
    }
}