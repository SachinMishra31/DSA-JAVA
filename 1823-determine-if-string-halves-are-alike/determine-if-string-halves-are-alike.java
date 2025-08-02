class Solution {
    public boolean halvesAreAlike(String s) {

        String vowels = "aeiouAEIOU";
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                count1++;
            }
        }

        for (int j = s.length() / 2; j < s.length(); j++) {
            if (vowels.contains(String.valueOf(s.charAt(j)))) {
                count2++;
            }
        }

        return count1 == count2;
    }
}