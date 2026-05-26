class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while(left < right) {
            int cur = numbers[left] + numbers[right];
            if(cur > target) {
                right--;
            } else if(cur < target) {
                left++;
            } else{
                return new int[]{left + 1, right + 1};
            }
        }

        return new int[]{-1, -1};
    }
}
