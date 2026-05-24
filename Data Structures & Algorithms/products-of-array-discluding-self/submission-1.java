class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int total = 1;
        int zeroCount = 0;
        int[] res = new int[n];

        for(int num: nums) {
            if(num == 0) {
                zeroCount++;
            } else {
                total *= num;
            }
        }

        if(zeroCount > 1) return res;
        if(zeroCount == 1) {
            for(int idx = 0; idx < n; idx++) {
                if(nums[idx] == 0) res[idx] = total;
            }
            return res;
        }
        for(int idx = 0; idx < n; idx++) {
            res[idx] = total / nums[idx];
        }

        return res;
    }
}