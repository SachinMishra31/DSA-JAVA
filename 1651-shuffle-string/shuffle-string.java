class Solution {
    public String restoreString(String s, int[] indices) {
      char[] result = new char[s.length()];
      int n = indices.length;
      for(int i = 0; i < n; i++){
        result[indices[i]] = s.charAt(i);
      }
      return new String(result);
    }
}