class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();

        var seen = new HashSet<Character>();
        int l = 0, res = 0;

        for(int r = 0; r < s.length(); r++) {
            while(seen.contains(s.charAt(r))) {
                seen.remove(s.charAt(l));
                l++;
            } 
            seen.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
