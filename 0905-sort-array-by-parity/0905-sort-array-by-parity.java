class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end){
            
//             all input elements are even then to avoid out of bound start < end
//             2,4,6 if s<e was not present then after 6%2==0 start++ then nums[3] which is out of bound
           while(start < end && nums[start] % 2 == 0){
               start++;
           }
//             similarly here if all elements are odd then if s<e was not present then nums[-1]
           while(start < end && nums[end] % 2 != 0){
                end--;
           }
//          this step if want to swap i.e at wrong position element are present
           if(start < end){
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