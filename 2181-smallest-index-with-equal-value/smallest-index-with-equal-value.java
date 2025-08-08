class Solution {
    public int smallestEqual(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int mod = i%10;
            if(mod == nums[i]){
                return i;
            }
        }

        return -1;
    }
}