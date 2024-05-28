class Solution {
    public int hammingWeight(int n) {
        //String binary="";
        int reminder=0;
        int temp=n,count=0;
        while(temp>0){
            reminder=temp%2;
            if(reminder==1){
                count++;
            }
          temp/=2;
        }
        //System.out.println(binary);
        return count;
    }
}