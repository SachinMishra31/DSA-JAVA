class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
       for(int num : nums){

        if( num%3 == 0){
            continue;
        }
        if( num != 3){
            count++;
        }
       } 
       return count;
    }
}