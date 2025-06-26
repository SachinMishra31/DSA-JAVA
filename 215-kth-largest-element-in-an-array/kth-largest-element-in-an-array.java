import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);         // push
            if (minHeap.size() > k) {
                minHeap.poll();         // pop smallest
            }
        }

        return minHeap.peek();           // kth largest
    }
}
