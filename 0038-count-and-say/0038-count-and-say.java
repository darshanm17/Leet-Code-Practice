class Solution {
    public String countAndSay(int n) {
    String num="1";
    while(n-->1){
         num=count(num);
        }   
        return num;
    }
    private String count(String num){
        StringBuilder sb=new StringBuilder();
        int n=num.length();
        for(int i=0,j=0;i<n;i=j){
            while(j<n && num.charAt(j)==num.charAt(i)){
                j++;
            }
            sb.append(j-i).append(num.charAt(i));
        }
return sb.toString();
    }
}