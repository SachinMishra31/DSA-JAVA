class Solution {
    public int minStartValue(int[] nums) {
        int minPrefix = 0;
        int sum = 0;

        for( int num : nums){
           sum += num;
           minPrefix = Math.min(minPrefix , sum);
        }

        return 1-(minPrefix);
    }
}