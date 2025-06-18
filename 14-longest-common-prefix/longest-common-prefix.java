class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int index = 0;
        int i = 0;
        while(i < first.length()){
            if(first.charAt(index) == last.charAt(index)){
                index++;
            }
            i++;
        }

        return first.substring(0 , index);
    }
}