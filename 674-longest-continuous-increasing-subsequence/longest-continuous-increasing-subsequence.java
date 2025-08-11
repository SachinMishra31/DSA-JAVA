class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int currCount = 1;
        int prevCount = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1]) {
                currCount++;
            } else {
                currCount = 1;
            }
            prevCount = Math.max(prevCount, currCount);
        }

        return prevCount;
    }
}