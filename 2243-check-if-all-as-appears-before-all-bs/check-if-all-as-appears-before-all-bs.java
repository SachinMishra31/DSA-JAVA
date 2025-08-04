class Solution {
    public boolean checkString(String s) {
      int count = 0;
      

      for(int i = 0; i < s.length() - 1; i++){
        if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
            return false;
        }

        if(s.charAt(i) == 'b'){
            count++;
            if(count == s.length()){
                return true;
            }
        }
      }

      return true;
    }
}