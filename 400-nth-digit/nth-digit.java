class Solution {
    public int findNthDigit(int n) {
        int length = 1;
        long count = 9;
        int start = 1;

        // Step 1: find digit length group
        while (n > length * count) {
            n -= length * count;
            length++;
            count *= 10;
            start *= 10;
        }

        // Step 2: Find the actual number
        int number = start + (n - 1) / length;

        // Step 3: Find the digit in that number
        String s = String.valueOf(number);
        return s.charAt((n - 1) % length) - '0';
    }
}
