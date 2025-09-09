class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        for(int i = 0; i < arr.length-1; i++){
            int maxIdx = i;
            for(int j = i+1; j < arr.length; j++){
                String s1 = arr[j] + arr[maxIdx];
                String s2 = arr[maxIdx] + arr[j];
                if(s1.compareTo(s2) > 0){
                    maxIdx = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s);
        }

        if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}