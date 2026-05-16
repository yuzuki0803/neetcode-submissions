class Solution {
    public int majorityElement(int[] nums) {
        return Arrays.stream(nums).boxed().collect(
            Collectors.collectingAndThen(Collectors.toMap(x -> x, x -> 1, Integer::sum),
                map -> Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey()));
    }
}