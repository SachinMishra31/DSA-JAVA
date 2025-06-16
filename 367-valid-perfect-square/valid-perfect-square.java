class Solution {
    public boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        for(int i = 1; i <= n; i++){
             int checkPerfectSquare = i*i;
             if(checkPerfectSquare == num){
                return true;
             }
        }
       return false;
    }
}