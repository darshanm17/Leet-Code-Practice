class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str="";
        if(strs[0]==""){
            return str;
        }
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                str+=strs[0].charAt(i);
            }
            else{
                return str;
            }
        }
        return str;
        
    }
}