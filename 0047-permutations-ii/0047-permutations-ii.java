class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(Integer num:nums){
            list.add(num);
        }
        findPermute(nums,0,list);
        return ans;
    }
    private void findPermute(int[] nums,int index,List<Integer> list){
        if(index==nums.length){
            if(!ans.contains(list)){
            ans.add(new ArrayList<>(list));
            }
        }
        for(int i=index;i<nums.length;i++){
            int temp=list.get(index);
            list.set(index,list.get(i));
            list.set(i,temp);
            findPermute(nums,index+1,list);
            temp=list.get(index);
            list.set(index,list.get(i));
            list.set(i,temp);
        }
    }
}