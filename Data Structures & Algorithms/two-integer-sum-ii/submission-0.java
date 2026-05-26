class Solution {
    public int[] twoSum(int[] numbers, int target) {
        var map = new HashMap<Integer, Integer>();

        for(int idx = 0; idx < numbers.length; idx++) {
            int diff = target - numbers[idx];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), idx + 1};
            }
            map.put(numbers[idx], idx + 1);
        }

        return new int[]{-1, -1};
    }
}
