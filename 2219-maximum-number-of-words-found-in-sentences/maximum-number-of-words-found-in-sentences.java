class Solution {
    public int mostWordsFound(String[] sentences) {
       int totalwords = 0;
       int currwords = 0;

       for(String str : sentences){
        if(!str.trim().isEmpty()){
            currwords  = str.trim().split("\\s+").length;
            totalwords = Math.max(totalwords , currwords );

        }
       } 
        return totalwords;
    }
}