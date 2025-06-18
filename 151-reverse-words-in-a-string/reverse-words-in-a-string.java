class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        String[] Words = s.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = Words.length - 1; i >= 0; i--) {
            result.append(Words[i]);
            if (i != 0)
                result.append(" ");
        }

        return result.toString();
    }
}