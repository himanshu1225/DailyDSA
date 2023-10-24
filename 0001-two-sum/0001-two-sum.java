class Solution {
    public int[] twoSum(int[] nums, int target) {
           // using 2 for loops -> n square time
       // sort the array and use 2 pointer -> wont work as index will change
       // will use hashMap value, index 
       // let say idx1 and idx2 is answer-> target - arr[idx1] = arr[idx2] 
       // -,-,nums[idx1]-,-,-,-,nums[idx2]   these are the elements
        // I will check target-nums[i] = value that exist in hashmap if yes will return both index. 
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
           int secondValue = target - nums[i];
           if(map.containsKey(secondValue)){
               return new int[]{map.get(secondValue), i};
           } else {
               map.put(nums[i], i);
           }
       }
       return new int[] {-1, -1}; 
    }
}