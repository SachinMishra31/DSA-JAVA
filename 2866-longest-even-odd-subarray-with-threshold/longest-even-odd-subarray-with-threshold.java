class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int maxLen = 0;
        int len = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] > threshold || nums[i]%2 == 1){
                len = 0;
            }else{
                len = 1;
                int j = i+1;
                while( j < n && nums[j] <= threshold && nums[j]%2 != nums[j-1]%2){
                    len++;
                    j++;
                }

                maxLen = Math.max(maxLen , len);
                i = j-1;
            }
        }

        return maxLen;
    }
}