class Solution {
    public String convertToBase7(int num) {
        StringBuilder result = new StringBuilder();

        if (num == 0) {
            return "0";
        }

        boolean negative = num < 0;
        num = Math.abs(num);

        while (num > 0) {
            int rem = num % 7;
            result.append(rem);
            num = num / 7;
        }

        if (negative) {
            result.append('-');
        }
        result.reverse();

        return result.toString();
    }
}