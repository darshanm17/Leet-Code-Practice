class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        nums1=sorting(nums1,nums2);
        int n=nums1.length;
        double ans=0.0;
        if(n%2!=0){
            int left=0;
            int right=n-1;
            int mid=left+(right-left)/2;
           ans=nums1[mid];
        }
        else{
            int left=0;
            int right=n-1;
            int mid=left+(right-left)/2;
           
            ans=(nums1[mid]+nums1[mid+1])/2.00;
        }
        return ans;
        
     } 
     public int[] sorting(int[] arr1,int[] arr2){
         int n1=arr1.length;
         int n2=arr2.length;
         int[] ans=new int[n1+n2];
         int left=n1-1;
         int right=0;
         while(left>=0 && right<n2){
             if(arr1[left]>arr2[right]){
                 int temp=arr2[right];
                 arr2[right]=arr1[left];
                 arr1[left]=temp;
                 left--;
                 right++;
             }
             else{
                 break;
             }
         }
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         for(int i=0;i<n1;i++){
          ans[i]=arr1[i];
        
         }
         for(int i=n1;i<n1+n2;i++){
             ans[i]=arr2[i-n1];
         }
     
         return ans;
     }
    }
