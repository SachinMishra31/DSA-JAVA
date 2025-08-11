class Solution {
    public String licenseKeyFormatting(String s, int k) {
       StringBuilder clean = new StringBuilder();

       for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) != '-'){
               clean.append(Character.toUpperCase(s.charAt(i)));
           }
       } 

       StringBuilder result = new StringBuilder();
       int count = 0;

       for(int i = clean.length() - 1; i >= 0; i--){
           result.append(clean.charAt(i));
           count++;
           if(count == k && i != 0){
              result.append('-');
              count = 0;
           }
       }

       return result.reverse().toString();
    }
}