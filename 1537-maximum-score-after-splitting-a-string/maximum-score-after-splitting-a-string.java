class Solution {
    public int maxScore(String s) {
        char[] charArr = s.toCharArray();

        
        int totalSc = 0;

        for (int i = 0; i < charArr.length-1; i++) {
            int left = 0;
            int right = 0;

            for (int j = 0; j <= i; j++) {
                if (charArr[j] == '0') {
                    left++;
                }
            }

            for (int k = i + 1; k < charArr.length; k++) {
                if (charArr[k] == '1') {
                    right++;
                }
            }

            
            totalSc = Math.max(totalSc, left+right );
        }
          return totalSc;
    }
}