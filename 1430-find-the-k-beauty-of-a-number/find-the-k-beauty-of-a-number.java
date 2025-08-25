class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int count = 0;
        for (int i = 0; i <= str.length()-k; i++) {
            String s = str.substring(i, i + k);
            int n = Integer.parseInt(s);
            if (n != 0 && num % n == 0) {
                count++;
            }

        }
        return count;
    }
}