class Solution {
    public int arrayPairSum(int[] nums) {
        
        // 2n : even length
//         n pairs: if size of array is 4 then grouping size of pairs is 2
//         if size : 6 then grouping size 3 i.e. in one group 3 pairs will be there
//         1,4,3,2  min(1,4) + min(3,2) = 1 + 2 = 3, min(1,3)+min(4,2) = 1+2 = 3, min(1,2)+min(3,4) = 1+3 = 4
//         if sort increasing: 1,2,3,4 --> min(1,2) + min (3,4) = 1+ 3 = 4
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i=i+2){
            // sum += Math.min(nums[i], nums[i+1]);
//             when we sort it we dont need to take min also, always add ithe element as that will be min
            sum += nums[i];
        }
        return sum;
    }
}