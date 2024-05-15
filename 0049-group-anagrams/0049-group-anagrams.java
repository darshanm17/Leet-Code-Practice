class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String,List<String>> map=new HashMap<>();
      for(String word:strs){
        char[] chars=word.toCharArray();
        Arrays.sort(chars);
        //System.out.println(Arrays.toString(chars));
        String sortedWord=new String(chars);
        //System.out.println(sortedWord);
        if(!map.containsKey(sortedWord)){
            map.put(sortedWord,new ArrayList<>());
        }
        map.get(sortedWord).add(word);
      }
     // System.out.println(map);
      return new ArrayList<>(map.values());
    }
}