class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var queue = Arrays.stream(nums).boxed()
                .collect(Collectors.collectingAndThen(
                        Collectors.toMap(x-> x, x -> 1, Integer::sum),
                        map -> {
                            var q = new PriorityQueue<>(Map.Entry.<Integer, Integer>comparingByValue().reversed());
                            map.entrySet().forEach(q::offer);
                            return q;
                        }
                ));

        return IntStream.rangeClosed(1,k)
                .map(i -> queue.remove().getKey())
                .toArray();
    }
}
