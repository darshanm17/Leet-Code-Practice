class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m=matrix.length;
       if(m==0){
        return false;
       }
       int n=matrix[0].length;
       int left=0;
       int right=m*n-1;
       int midelem,rowidx,colidx;
            while(left<=right){
                int mid=left+(right-left)/2;
                rowidx=mid/n;
                colidx=mid%n;
                midelem=matrix[rowidx][colidx];
                if(midelem==target){
                    return true;
                }
                else if(midelem>target){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        
        return false;
           }
}