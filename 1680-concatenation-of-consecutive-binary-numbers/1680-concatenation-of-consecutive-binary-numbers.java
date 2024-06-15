class Solution {
    public int concatenatedBinary(int n) {
        final long mod = (long)(1e9 + 7);
        long result = 0;
        int size = 0;
        for(int i = 1; i <= n; i++)
        {
            if((i & (i-1)) == 0)
            {
                size++;
            }
            result = ((result << size) | i)%mod;
        }
        
        return (int)result;
    }
}