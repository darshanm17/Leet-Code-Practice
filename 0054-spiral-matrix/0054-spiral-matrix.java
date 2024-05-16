class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> list=new ArrayList<>();
      int top=0,bottom=n-1,left=0,right=m-1;
      while(left<=right && top<=bottom){
        for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            list.add(matrix[i][right]);
        }
        right--;
         if (!(left <= right && top <= bottom)) {
                break;
            }
        for(int i=right;i>=left;i--){
            list.add(matrix[bottom][i]);
        }
        bottom--;
        for(int i=bottom;i>=top;i--){
            list.add(matrix[i][left]);
        }
        left++;
      }
      return list;
    }
}