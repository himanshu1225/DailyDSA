class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
           int[] p = new int[n];
           p[0] = nums[0];
           for(int i = 1; i < n; i++){
               p[i] = p[i-1] ^ nums[i];
           }
        int maxXor = (1 << maximumBit) -1;
        int [] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = p[n-1-i] ^ maxXor;
        } 
        return res;
    }
}

