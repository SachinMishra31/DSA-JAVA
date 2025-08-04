class Solution {
    public boolean isMonotonic(int[] nums) {
     int inc = 0;
     int dec = 0;
     
     if(nums.length == 1) return true;

     for(int i = 0; i < nums.length - 1; i++){
        if(nums[i] >= nums[i+1]){
            dec++;
            if(dec == nums.length-1){
                return true;
            }
        }
        if(nums[i] <= nums[i+1]){
            inc++;
            if(inc == nums.length-1){
                return true;
            }
        }
     }   

     return false;
    }
}