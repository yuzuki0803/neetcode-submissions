class Solution {
    public int longestConsecutive(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        int res = 0;

        for (var num : nums) {
            if (!map.containsKey(num)) {
                Integer length = map.getOrDefault(num - 1, 0) + map.getOrDefault(num + 1, 0) + 1;
                map.put(num, length);
                map.put(num - map.getOrDefault(num - 1, 0), length);
                map.put(num + map.getOrDefault(num + 1, 0), length);
                res = Math.max(res, length);
            }
        }

        return res;
    }
}