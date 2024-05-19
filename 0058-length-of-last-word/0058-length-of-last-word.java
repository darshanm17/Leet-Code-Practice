class Solution {
    public int lengthOfLastWord(String s) {
       
        s=s.trim();
        
        //System.out.println(s);
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
               // System.out.println(s);
                return (s.length()-i-1);
            }
                
        }

        return s.length();
        
    }
    }
