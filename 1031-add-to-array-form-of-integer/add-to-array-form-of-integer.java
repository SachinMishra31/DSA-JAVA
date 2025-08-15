import java.util.*;
import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        StringBuilder str = new StringBuilder();
        for (int digit : num) {
            str.append(digit);
        }
        BigInteger num1 = new BigInteger(str.toString());

        BigInteger sum = num1.add(BigInteger.valueOf(k));

        while (sum.compareTo(BigInteger.ZERO) > 0) {
            int n = sum.mod(BigInteger.TEN).intValue();
            result.add(n);
            sum = sum.divide(BigInteger.TEN);
        }

        if (result.isEmpty())
            result.add(0);

        Collections.reverse(result);
        return result;
    }
}
