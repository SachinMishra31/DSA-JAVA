class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Convert to char array, sort, then make string
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // Add to map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        // Return the grouped anagrams
        return new ArrayList<>(map.values());
    }
}
