class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int evenIdx = 0;
        int oddIdx = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIdx++] = num;
            } else {
                result[oddIdx--] = num;
            }
        }
        return result;
    }
}