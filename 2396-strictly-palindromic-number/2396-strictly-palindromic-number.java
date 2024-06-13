class Solution {
    public boolean isStrictlyPalindromic(int n) {
       
        for(int i=2;i<=n-2;i++){
             String check=decimalToBinary(n,i);
             if(!isPalindrome(check))
             return false;
        }
        return true;
    }
    private String decimalToBinary(int n,int base){
        int temp=n;
        String binary="";
        while(temp>0){
            int reminder=temp%base;
            binary=Integer.toString(reminder)+binary;
            temp/=base;
        }
        return binary;
    }
    private boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right))
            return false;
            left++;right--;
        }
        return true;
    }
}