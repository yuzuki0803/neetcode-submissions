class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        var chars = new HashSet<Character>();

        s.chars().mapToObj(ch -> (char)ch).forEach(chars::add);

        for(char ch: chars) {
            int l = 0, count = 0;

            for(int r = 0; r < s.length(); r++) {
                if(s.charAt(r) == ch) count++;

                while((r - l + 1) - count > k) {
                    if(s.charAt(l) == ch) count--;
                    l++;
                }

                res = Math.max(res, r - l + 1);
            }
        }

        return res;
    }
}
