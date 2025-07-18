class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int start = 0;
        int end = numbers.length-1;
        while(start < end){
            sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[]{start+1, end+1};
            }if(sum < target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{-1 , -1};
    }
}