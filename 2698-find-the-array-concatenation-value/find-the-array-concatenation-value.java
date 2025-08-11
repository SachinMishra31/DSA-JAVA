class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long concatValue = 0;

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
         if(start == end){
            concatValue += nums[start];
         }else{
            String combinedstr = nums[start] + "" + nums[end];
            long combined = Long.parseLong(combinedstr);
            concatValue += combined;
         }
         start++;
         end--;
        }

        return concatValue;
    }
}