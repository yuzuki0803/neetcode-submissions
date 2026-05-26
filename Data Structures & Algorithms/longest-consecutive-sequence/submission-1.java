class Solution {
    public int longestConsecutive(int[] nums) {
        var set = new HashSet<Integer>();
        for (var num : nums) {
            set.add(num);
        }

        int seqLen = 0;
        for (int num : nums) {
            int len = 1;
            if (!set.contains(num - 1)) {
                while ((set.contains(num + len))) {
                    len++;
                }
            }
            seqLen = Math.max(seqLen, len);
        }
        return seqLen;
    }
}
