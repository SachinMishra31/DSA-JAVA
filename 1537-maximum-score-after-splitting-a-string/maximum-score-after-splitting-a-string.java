class Solution {
    public int maxScore(String s) {
        int totalOnes = 0;
        int maxSc = 0;
        for( char c : s.toCharArray()){
            if( c == '1'){
                totalOnes++;
            }

            int leftZeroes = 0;
            int rightOnes = totalOnes;

            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == '0'){
                    leftZeroes++;
                }else{
                    rightOnes--;
                }
            maxSc = Math.max( maxSc , leftZeroes + rightOnes);
            }
        }

        return maxSc;
    }
}