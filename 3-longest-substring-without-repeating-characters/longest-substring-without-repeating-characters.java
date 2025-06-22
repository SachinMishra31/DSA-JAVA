class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);

            while (set.contains(current)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(current);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
