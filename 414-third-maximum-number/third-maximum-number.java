class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }

        if (set.size() < 3) {
            return set.last();
        }

        Iterator<Integer> it = set.descendingIterator();
        it.next();
        it.next();
        return it.next();

    }
}