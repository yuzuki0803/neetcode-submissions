class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int zeroCount = 0;
        int zeroIndex = -1;
        int[] res = new int[n];

        for (int idx = 0; idx < n; idx++) {
            if (nums[idx] == 0) {
                zeroCount++;
                zeroIndex = idx;
                if (zeroCount > 1) return res;
            } else {
                product *= nums[idx];
            }
        }

        if (zeroCount == 1) {
            res[zeroIndex] = product;
            return res;
        }

        for (int idx = 0; idx < n; idx++) {
            res[idx] = product / nums[idx];
        }

        return res;
    }
}