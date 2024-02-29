class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[]ans = new int[len];
        int i = 0, j = n;
        int k = 0;
        while(i < n && j < len){
            ans[k++] = nums[i++];
            ans[k++] = nums[j++];
        }
        return ans;
    }
}