class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int n=nums.length;
        if(n==1){
            list.add(nums[0]+"");
            return list;
        }
        for(int i=0;i<n;i++){
            int a=nums[i];
            while(i+1<n && (nums[i+1]-nums[i])==1){
                i++;
            }
            if(a!=nums[i]){
                list.add(a+"->"+nums[i]);
            }else{
                list.add(a+"");
            }
        }
        return list;
    }
}