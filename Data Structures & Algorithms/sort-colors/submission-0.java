class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0, c = 0, idx = 0;

        for(int num: nums) {
            switch(num) {
                case 0 -> a++;
                case 1 -> b++;
                case 2 -> c++;
            }
        }

        while(a > 0) {
            nums[idx++] = 0;
            a--;
        }
        while(b > 0) {
            nums[idx++] = 1;
            b--;
        }
        while(c > 0) {
            nums[idx++] = 2;
            c--;
        }
    }
}