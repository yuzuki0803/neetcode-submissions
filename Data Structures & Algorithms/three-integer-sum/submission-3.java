class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        var res = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for(int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            while(l < r) {
                int cur = nums[l] + nums[r] + nums[i];

                if(cur > 0) {
                    r--;
                } else if(cur < 0) {
                    l++;
                } else {
                    res.add(List.of(nums[i], nums[l], nums[r]));
                    while(l < r && nums[l] == nums[l + 1]) l++;
                    while(r > l && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
            }

        }

        return res;
    }
}
