class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> NoDuplicates = new ArrayList<>();
        NoDuplicates.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                NoDuplicates.add(nums[i]);
            }
        }

        int count = 0;
        for (int j = 1; j < NoDuplicates.size() - 1; j++) {
            int prev = NoDuplicates.get(j - 1);
            int curr = NoDuplicates.get(j);
            int next = NoDuplicates.get(j + 1);

            if ((prev < curr && curr > next) || prev > curr && curr < next) {
                count++;
            }
        }

        return count;
    }
}