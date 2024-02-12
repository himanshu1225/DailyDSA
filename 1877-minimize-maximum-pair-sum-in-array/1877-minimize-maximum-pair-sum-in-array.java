class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int pairSum = 0;
        for(int i = 0; i < n/2; i++){
            pairSum = Math.max(pairSum, nums[i] + nums[n-1-i]);
        }
        return pairSum;
    }
}