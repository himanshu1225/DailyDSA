class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int p1 = 0, p2=n-1;
        
        for(int i = n-1; i >= 0; i--){
            if(Math.abs(nums[p1]) <= Math.abs(nums[p2])){
                ans[i] = nums[p2]*nums[p2];
                p2--;
            }else{
                ans[i] = nums[p1]*nums[p1];
                p1++;
            }
        }
        return ans;
    }
}