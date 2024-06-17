class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<=1)
        return true;

        long left=0,right=num;
        while(left<=right){
            long mid=left+(right-left)/2;
            long prod=mid*mid;
            if(prod==num)
            return true;
            else if(prod>num)
            right=mid-1;
            else
            left=mid+1;
        }
        return false;
    }
}