class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int len = words.length;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            String w = words[i];
            for (int j = w.length() - 1; j >= 0; j--) {
                result.append(w.charAt(j));
            }
            if (i != len - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}