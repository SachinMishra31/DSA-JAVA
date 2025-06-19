class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        if (n > h) return -1;

        // Traverse haystack from 0 to h - n
        for (int i = 0; i <= h - n; i++) {
            // Check if the substring from i to i+n equals needle
            if (haystack.substring(i, i + n).equals(needle)) {
                return i; // Found match
            }
        }

        return -1; // No match found
    }
}
