class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int[] row : image) {
            int left = 0, right = n - 1;

            // Flip and invert at the same time
            while (left <= right) {
                // Swap and invert
                int temp = row[left] ^ 1;
                row[left] = row[right] ^ 1;
                row[right] = temp;
                left++;
                right--;
            }
        }

        return image;
    }
}
