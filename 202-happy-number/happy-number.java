class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> used = new HashSet<>();
        while (n != 1) {
            if (used.contains(n)) {
                return false;
            }
            used.add(n);
            n = Square(n);
        }

        return true;
    }

    public int Square(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }
}