class Solution {
    public int largestAltitude(int[] gain) {
        int maxPre = 0;
        int sum = 0;
        for(int i = 0;  i < gain.length; i++){
            sum += gain[i];
            maxPre = Math.max(maxPre , sum);
        }

        return maxPre;
    }
}