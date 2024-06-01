class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
           int a=(int) s.charAt(i);
           int b=(int) s.charAt(i+1);
            int diff=Math.abs(a-b);
            sum+=diff;
        }
        return sum;
    }
}