class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] c=s.split(" ");
        int slen=c.length;
        if(pattern.length()!=slen)
        return false;
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(c[i]))
                return false;
            }
            else{
            if(map.containsValue(c[i]))           
             return false;
            map.put(pattern.charAt(i),c[i]);
            }
        }
        //System.out.println(Arrays.toString(c));
        return true;
        
    }
}