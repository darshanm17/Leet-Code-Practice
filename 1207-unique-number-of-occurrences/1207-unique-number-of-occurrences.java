class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
       // System.out.println(map);
       Set<Integer> s=new HashSet<>();
        for(Map.Entry<Integer,Integer> me:map.entrySet()){
            s.add(me.getValue());
        }
        return map.size()==s.size();
    }
}