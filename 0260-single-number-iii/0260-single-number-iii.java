class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            int i=0;
            for(Map.Entry<Integer,Integer> me:map.entrySet()){
                if(me.getValue()==1){
                    ans[i]=me.getKey();
                    i++;
                }
            }
            return ans;
    }
}