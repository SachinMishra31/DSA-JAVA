class Solution {
    public int countKeyChanges(String s) {
       int count = 0;
       int n = s.length();
       String lowerCase = s.toLowerCase();
       for(int i = 0; i < n-1; i++){
           if(lowerCase.charAt(i) != lowerCase.charAt(i+1)){
              count++;
           }
       } 

       return count;
    }
}