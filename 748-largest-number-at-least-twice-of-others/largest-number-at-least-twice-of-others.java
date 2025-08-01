class Solution {
    public int dominantIndex(int[] nums) {

        int[] copiedArray = Arrays.copyOf(nums, nums.length);

        Arrays.sort(copiedArray);
        int firstmax = copiedArray[nums.length - 1];
        int secondmax = copiedArray[nums.length - 2];
        if (firstmax >= secondmax * 2) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == firstmax) {
                    return i;
                }
            }
        }

        return -1;
    }
}