class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0] = 1;
        for(int idx = 1; idx < n; idx++) {
            pre[idx] = pre[idx - 1] * nums[idx - 1];
        }

        suf[n - 1] = 1;
        for(int idx = n - 2; idx >= 0; idx--) {
            suf[idx] = suf[idx + 1] * nums[idx + 1];
        }
        
        for(int idx = 0; idx < n; idx++) {
            nums[idx] = pre[idx] * suf[idx];
        }

        return nums;
    }
}