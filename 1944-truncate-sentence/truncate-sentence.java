class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        String[] words = s.split(" ");
        for(String word : words){
            result.append(word);
            count++;
            if(count == k){
                break;
            }

            result.append(" ");
        }
       return result.toString();
    }
}