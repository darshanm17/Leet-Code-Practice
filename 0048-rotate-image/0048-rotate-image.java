class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++){
            int right=row-1;
            int left=0;
          while(left<=right){
            int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
            left++;
            right--;
          }
        }
        //System.out.println(Arrays.toString(matrix));

    }
}