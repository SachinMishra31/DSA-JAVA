class Solution {
    public String reversePrefix(String word, char ch) {
        int end = word.indexOf(ch);

        if(end == -1){
            return word;
        }

        StringBuilder result = new StringBuilder(word.substring(0 , end+1));
        result.reverse();

        result.append(word.substring(end+1));

      return result.toString();
    }
}