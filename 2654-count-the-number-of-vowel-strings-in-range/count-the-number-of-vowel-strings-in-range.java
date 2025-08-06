class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        while(left <= right){
            String s = words[left];
            int n = s.length();
            char c1 = s.charAt(0);
            char c2 = s.charAt(n-1);
            
            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u'){
                if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u'){
                    count++;
                }
            }

            left++;
        }

        return count;
    }
}