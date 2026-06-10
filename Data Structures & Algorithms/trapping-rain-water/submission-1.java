class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n < 3) return 0;

        int left = 0, right = n - 1, leftMax = height[left], rightMax = height[right];
        int total = 0;

        while(left < right) {
            if(leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                total += (leftMax - height[left]);
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                total += (rightMax - height[right]);
            }
        }

        return total;
    }
}
