class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        if (k == 0) return res;

        int[] extended = new int[2 * n];
        for (int i = 0; i < n; i++) {
            extended[i] = code[i];
            extended[i + n] = code[i];
        }

        int sum = 0;

        if (k > 0) {
            for (int i = 1; i <= k; i++) sum += extended[i];
            res[0] = sum;

            for (int i = 1; i < n; i++) {
                sum -= extended[i];
                sum += extended[i + k];
                res[i] = sum;
            }
        } else {
            k = -k;
            for (int i = n - k; i < n; i++) sum += extended[i];
            res[0] = sum;

            for (int i = 1; i < n; i++) {
                sum -= extended[i - 1 + n - k];
                sum += extended[i - 1];
                res[i] = sum;
            }
        }

        return res;
    }
}
