class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0, idx = nums.length - 1;

        while(k <= idx) {
            if(nums[k] == val) {
                nums[k] = nums[idx--];
            } else{
                k++;
            }
        }

        return k;
    }
}