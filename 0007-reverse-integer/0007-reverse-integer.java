class Solution {
    public int reverse(int x) {
        int temp=x;
        int rev=0;
        int digit=0;
        
        if(x<0){
            temp=-1*(temp);
        }
        
        while(temp!=0){
            digit=temp%10;
                 if (rev > Integer.MAX_VALUE / 10 || (rev== Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            rev=rev*10+digit;
            temp=temp/10;
        }
        if(x<0){
            return -1*(rev);
        }
        
        return rev;
    }
}