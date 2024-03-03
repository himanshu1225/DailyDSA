class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        prefixSum[0] = 0;
        suffixSum[n-1] = 0;
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
        for(int i = n-2; i >= 0; i--){
            suffixSum[i] = suffixSum[i+1] + nums[i+1];
        }
        // 1  1  8  11 17 22
        // 27 20 17 11 6  6  
        for(int i = 0; i < n; i++){
            if(prefixSum[i] == suffixSum[i]) return i;
        }
        return -1;
    }
}