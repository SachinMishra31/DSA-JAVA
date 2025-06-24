class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26]; // For lowercase a-z

        // Count letters in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Use letters for ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                return false; // Letter not available
            }
            freq[c - 'a']--; // Use the letter
        }

        return true;
    }
}
