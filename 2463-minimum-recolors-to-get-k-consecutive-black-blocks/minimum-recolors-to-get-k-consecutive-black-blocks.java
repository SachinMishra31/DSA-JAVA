class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int countW = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                countW++;
            }
        }

        int minOps = countW;

        for (int i = k; i < n; i++) {
            if (blocks.charAt(i - k) == 'W') {
                countW--;
            }
            if (blocks.charAt(i) == 'W') {
                countW++;
            }

            minOps = Math.min(minOps, countW);
        }

        return minOps;
    }
}