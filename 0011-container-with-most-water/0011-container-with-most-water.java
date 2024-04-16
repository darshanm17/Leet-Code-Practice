class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int width=height.length-1;
        int minheight=height[left];
        int maxarea=Integer.MIN_VALUE;
        while(left<right){
            minheight=Math.min(height[left],height[right]);
            int area=width*minheight;
            width--;
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
            maxarea=Math.max(maxarea,area);

        }
        return maxarea;
    }
}