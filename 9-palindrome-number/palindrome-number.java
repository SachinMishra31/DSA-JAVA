class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) return false;
        
        int original = x;  // Store original value
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            rev = rev * 10 + digit;
        }

        return rev == original; // Compare reversed number with original
    }
}
