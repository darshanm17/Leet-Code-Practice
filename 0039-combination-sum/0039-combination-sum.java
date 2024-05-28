class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<Integer> al=new ArrayList<>();
        findAns(candidates,target,0,al);
        return ans;
    }

    public void findAns(int[] nums,int target,int index,List<Integer> al){
        if(target<0){
            return;
        }
        if(index==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(al));
            }
            return ;
        }
        al.add(nums[index]);
        findAns(nums,target-nums[index],index,al);
        al.remove(al.size()-1);
        findAns(nums,target,index+1,al);
        return;
    }
}