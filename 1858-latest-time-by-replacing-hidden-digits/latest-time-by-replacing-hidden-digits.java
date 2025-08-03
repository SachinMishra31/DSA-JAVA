class Solution {
    public String maximumTime(String time) {
        StringBuilder result = new StringBuilder(time);

        // Hour - First digit (h1)
        if (result.charAt(0) == '?') {
            if (result.charAt(1) == '?' || result.charAt(1) <= '3') {
                result.setCharAt(0, '2');
            } else {
                result.setCharAt(0, '1');
            }
        }

        // Hour - Second digit (h2)
        if (result.charAt(1) == '?') {
            if (result.charAt(0) == '2') {
                result.setCharAt(1, '3');
            } else {
                result.setCharAt(1, '9');
            }
        }

        // Minute - First digit (m1)
        if (result.charAt(3) == '?') {
            result.setCharAt(3, '5');
        }

        // Minute - Second digit (m2)
        if (result.charAt(4) == '?') {
            result.setCharAt(4, '9');
        }

        return result.toString();
    }
}
