class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        Set<Integer> primeSet = Set.of(2, 3, 5, 7, 11, 13, 17, 19);

        int count = 0;

        for (int i = left; i <= right; i++) {
            int setBits = Integer.bitCount(i);
            if (primeSet.contains(setBits)) {
                count++;
            }
        }

        return count;
    }
}
