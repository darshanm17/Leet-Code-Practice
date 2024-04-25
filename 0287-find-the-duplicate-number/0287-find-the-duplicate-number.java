class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map);
        int maximum = Collections.max(map.values());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==maximum){
                return entry.getKey();
            }
        }
        return 0;
    }
}