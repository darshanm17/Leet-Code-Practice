class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
          HashMap<Character,String> map=new HashMap<>();
       
        
          if(digits.length()<1||digits==null){
              return list;
          }
         map.put('2',"abc");
         map.put('3',"def");
         map.put('4',"ghi");
         map.put('5',"jkl");
         map.put('6',"mno");
         map.put('7',"pqrs");
         map.put('8',"tuv");
         map.put('9',"wxyz");  
        backtrack(digits,0,new StringBuilder(),list,map);
        return list;
    }
    public void backtrack(String a,int idx,StringBuilder comb,List<String> list,Map<Character,String> map ){
        if(idx==a.length()){
            list.add(comb.toString());
            return;
        }
        String letters=map.get(a.charAt(idx));
        for(char letter:letters.toCharArray()){
            comb.append(letter);
            backtrack(a,idx+1,comb,list,map);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}