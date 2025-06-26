class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int lcm = nums[i]; // Start with the current number

            for (int j = i; j < n; j++) {
                lcm = lcm(lcm, nums[j]); // Update the LCM with each element

                if (lcm == k) {
                    count++; // Found a valid subarray
                }
                if (lcm > k) break; // Stop further checking, LCM only increases
            }
        }

        return count;
    }

    // Find Greatest Common Divisor
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Find Least Common Multiple
    private int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
