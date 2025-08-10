class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int maxDif = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (nums[i] < nums[j] && i < j) {
                    int currDif = nums[j] - nums[i];
                    maxDif = Math.max(maxDif, currDif);
                }
            }
        }

        return maxDif;
    }
}