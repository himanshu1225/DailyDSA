class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
//  brute force: o(n2)
// Count sort technique: As in constraits number of elements are from 0 to 100 samll range.
// optimize the solution by using a counting sort technique to count the occurrences of each number and then use this information to determine the count of smaller numbers than the current number.
//  Time: o(n) and space is O(101) + o(n)       
        int[] freq = new int[101];
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }
// count of each element is computed. [0,1,2,1,0,0,0,0,1]
// will calculate running sum
        for(int i = 1; i < 101; i++){
            freq[i] = freq[i] + freq[i-1];
        }
//  running sum: [0,1,3,4,4,4,4,4,5]
//                0 1 2 3 4 5 6 7 8
// This signifies that there are 4 elemets(i-1) which is less than 8, 1 element less than 2 (i-1)
        int [] ans= new int[nums.length];
        for(int i = 0; i < nums.length; i++){
//          [5,0,10,0,10,6]  -- > if condition is if element is zero.
            if(nums[i] == 0){
                ans[i] = 0;
            }else{
                ans[i] = freq[nums[i] -1];   
            }
        }
        return ans;
    }
}