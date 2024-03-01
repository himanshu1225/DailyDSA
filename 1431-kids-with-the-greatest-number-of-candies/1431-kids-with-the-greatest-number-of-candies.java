class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandie = Arrays.stream(candies).max().getAsInt();
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= maxCandie){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}