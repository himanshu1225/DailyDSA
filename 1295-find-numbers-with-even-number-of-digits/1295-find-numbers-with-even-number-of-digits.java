class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(containEvenDigits(num)){
                count++;
            }
        }
        return count;
    }
    
    private boolean containEvenDigits(int num){
        // int count = 0;
        // while(num > 0){
        //     count++;
        //     num = num/10;
        // }
        // return count % 2 == 0;
        int count = (int) Math.log10(num) + 1;
        return count % 2 == 0;
    }
}