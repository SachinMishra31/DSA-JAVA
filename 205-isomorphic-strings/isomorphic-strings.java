import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If lengths are not equal, they can't be isomorphic
        if (s.length() != t.length()) return false;

        // Map to store s → t mapping
        HashMap<Character, Character> mapST = new HashMap<>();
        // Map to store t → s mapping (to prevent duplicate reverse mapping)
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i); // character from s
            char c2 = t.charAt(i); // character from t

            // Check if c1 is already mapped
            if (mapST.containsKey(c1)) {
                // If mapped to different character, it's not valid
                if (mapST.get(c1) != c2) return false;
            } else {
                // If c2 is already mapped to another character, invalid
                if (mapTS.containsKey(c2)) return false;

                // Otherwise, map both ways
                mapST.put(c1, c2);
                mapTS.put(c2, c1);
            }
        }

        return true; // All mappings are valid
    }
}
