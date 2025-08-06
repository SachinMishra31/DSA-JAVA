class Solution {
    public String removeTrailingZeros(String num) {
     int lastNonZeroIndex = num.length() -1;

     while(lastNonZeroIndex > 0 && num.charAt(lastNonZeroIndex) == '0'){
        lastNonZeroIndex--;
     }

     return num.substring(0 , lastNonZeroIndex + 1);
    }
}