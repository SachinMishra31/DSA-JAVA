class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer , Integer> CountMap = new HashMap<>();
    List<Integer> result = new ArrayList<>();

    for(int num : nums1){
        CountMap.put(num , CountMap.getOrDefault(num , 0)+1);
    }

    for(int num : nums2){
        if(CountMap.containsKey(num) && CountMap.get(num) > 0){
            result.add(num);
            CountMap.put( num , CountMap.get(num) -1);
        }
    }

    int [] arr = new int[result.size()];
    int index = 0;
    for(int num : result){
        arr[index++] = num;
    }

    return arr;
}
}