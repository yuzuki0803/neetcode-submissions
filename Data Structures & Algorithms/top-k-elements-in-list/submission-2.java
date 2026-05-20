class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var freq = new HashMap<Integer, Integer>();

        for(int num: nums) {
            freq.merge(num, 1, Integer::sum);
        }

        var heap = new PriorityQueue<>(k, Map.Entry.<Integer, Integer>comparingByValue());

        for(var entry: freq.entrySet()) {
            heap.offer(entry);
            if(heap.size() > k){
                heap.poll();
            }
        }

        return IntStream.range(0, k).map(i -> heap.poll().getKey()).toArray();
    }
}
