class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int count=0,max=0;
       int left=0,right=0;
       while(right<=s.length()-1){
           char ch=s.charAt(right);
           if(!set.contains(ch)){
               set.add(ch);
                right++;
                count++;
                max=Math.max(right - left,max);
           }
           else{
               count=0;
               while(set.contains(ch)){
                   char ch1=s.charAt(left);
                   set.remove(ch1);
                   left++;
               }
           }
       }
       return max;
    }
}