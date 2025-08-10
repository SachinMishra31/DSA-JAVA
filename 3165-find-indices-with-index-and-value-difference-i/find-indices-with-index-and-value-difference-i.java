class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int len = nums.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                int indexDif = Math.abs(i - j);
                int valueDif = Math.abs(nums[i] - nums[j]);
                if(indexDif >= indexDifference && valueDif >= valueDifference){
                    return new int[]{i , j};
                }
            }
        }

        return new int[]{-1 , -1};
    }
}