class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        return IntStream.range(0, 2 * n).map(idx -> nums[idx % n]).toArray();
    }
}