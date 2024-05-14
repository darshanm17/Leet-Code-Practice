class Solution {
    public int hIndex(int[] citations) {
      Arrays.sort(citations);
      int h=0;
      for(int i=citations.length-1;i>=0;i--){
        if(h+1>citations[i]){
            return h;
        }
        h++;
      }
      return h;
    }

}