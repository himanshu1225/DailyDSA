class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end){
            if(nums[start] % 2 == 0){
                start++;
            }
            if(nums[end] %2 != 0){
                end--;
            }
//             start < end for 2 size case; (4, 1)  ---> s++ , e-- now e->4 and s->1 if s < e was not present then fir se swap ho jata
            if(start < end && nums[start] % 2 != 0 && nums[end] % 2 == 0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        return nums;
    }
}