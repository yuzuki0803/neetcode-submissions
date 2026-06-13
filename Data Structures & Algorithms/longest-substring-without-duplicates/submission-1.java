class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();

        var map = new HashMap<Character, Integer>();
        int l = 0, res = 0;

        for(int r = 0; r < s.length(); r++) {
            Character cur = s.charAt(r);

            if(map.containsKey(cur)) {
                l = Math.max(map.get(cur) + 1, l);
            } 
            map.put(cur, r);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
