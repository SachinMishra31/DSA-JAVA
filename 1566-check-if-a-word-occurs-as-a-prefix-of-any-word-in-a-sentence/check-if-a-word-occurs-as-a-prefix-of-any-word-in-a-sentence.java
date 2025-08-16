class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String num[] = sentence.split(" ");
        for (int i = 0; i < num.length; i++) {
            if (num[i].startsWith(searchWord)) {
                return i+1;
            }

        }

        return -1;
    }
}