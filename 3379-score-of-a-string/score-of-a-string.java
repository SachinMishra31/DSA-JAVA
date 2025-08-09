class Solution {
    public int scoreOfString(String s) {
       int sum = 0;
       int len = s.length();
       for(int i = 0; i < len-1; i++){
             int num1 = (int)(s.charAt(i));
             int num2 = (int)(s.charAt(i+1));
             sum += Math.abs(num1 - num2);
       }
       
       return sum;
    }
}