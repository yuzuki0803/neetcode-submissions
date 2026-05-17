class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);

        return nums;
    }

    private void sort(int[] nums, int start, int end) {
        if(start >= end) return;

        int mid = start + (end - start) / 2;
        sort(nums, start, mid);
        sort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int[] left = Arrays.copyOfRange(nums, start, mid + 1);
        int[] right = Arrays.copyOfRange(nums, mid + 1, end + 1);
        int k = start, l = 0, r = 0;

        while(l < left.length && r < right.length) {
            if(left[l] <= right[r]) {
                nums[k++] = left[l++];
            } else {
                nums[k++] = right[r++];
            }
        }

        while(l < left.length) {
            nums[k++] = left[l++];
        }

        while(r < right.length) {
            nums[k++] = right[r++];
        }
    }
}