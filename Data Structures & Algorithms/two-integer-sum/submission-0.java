class Solution {
    public int[] twoSum(int[] nums, int target) {
        var seen = new HashMap<Integer, Integer>();

        for(int idx = 0; idx < nums.length; idx++) {
            int diff = target - nums[idx];
            if(seen.containsKey(diff) && seen.get(diff) != idx) {
                return new int[]{seen.get(diff), idx};
            }
            seen.put(nums[idx], idx);
        }
        
        return new int[] {-1, -1};
    }
}
