class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int xor=0;
        for(Map.Entry<Integer,Integer> me:map.entrySet()){
            if(me.getValue()==2){
                xor^=me.getKey();
            }
        }
        return xor;
    }
}