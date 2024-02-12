class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < l.length; i++){
            ans.add(helper(nums, l[i], r[i]));
        }
        return ans;
    }
    
    public Boolean helper(int[] nums, int si, int ei){
        int n = ei-si+1;
        int [] temp = new int[n];
        System.arraycopy(nums, si, temp, 0, n);
        Arrays.sort(temp);
        int diff = temp[1] - temp[0];
        for(int i = 1; i < n-1; i++){
            if(temp[i+1]- temp[i] != diff){
                return false;
            }
        }
        return true;
    } 
}