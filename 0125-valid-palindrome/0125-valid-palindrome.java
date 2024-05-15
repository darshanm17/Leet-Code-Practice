class Solution {
    public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            char l=s.charAt(left),r=s.charAt(right);
            if(!Character.isLetterOrDigit(l))
            left++;
            //System.out.println(!Character.isLetterOrDigi(l));
            else if(!Character.isLetterOrDigit(r))
            right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }
            else{
                left++;
                right--;
            }

        }
        return true;
    }
}