public class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                // Replace both with the smaller of the two characters
                char minChar = (char)Math.min(chars[left], chars[right]);
                chars[left] = minChar;
                chars[right] = minChar;
            }
            left++;
            right--;
        }

        return new String(chars);
    }
}
