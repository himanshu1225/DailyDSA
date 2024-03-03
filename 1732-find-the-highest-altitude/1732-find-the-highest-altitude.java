class Solution {
    public int largestAltitude(int[] gain) {
        int currAlt = 0;
        int maxAlt = Integer.MIN_VALUE;
        for(int i = 0; i < gain.length; i++){
            currAlt = currAlt + gain[i];
            maxAlt = Math.max(currAlt, maxAlt);
        }
        return maxAlt > 0? maxAlt: 0;
    }
}