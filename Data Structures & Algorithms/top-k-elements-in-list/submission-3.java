class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var freq = new HashMap<Integer, Integer>();

        for (int num : nums) {
            freq.merge(num, 1, Integer::sum);
        }

        List<Integer>[] counts = new List[nums.length + 1];

        for (var entry : freq.entrySet()) {
            if (counts[entry.getValue()] == null) {
                counts[entry.getValue()] = new ArrayList<>();
            }
            counts[entry.getValue()].add(entry.getKey());
        }

        var res = new int[k];
        int idx = 0;

        for (int i = counts.length - 1; i >= 0; i--) {
            if (counts[i] == null)
                continue;
            for (int num : counts[i]) {
                res[idx++] = num;
                if (idx == k)
                    return res;
            }
        }

        return res;
    }
}
