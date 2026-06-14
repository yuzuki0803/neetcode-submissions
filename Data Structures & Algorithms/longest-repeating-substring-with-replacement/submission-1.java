class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0, l = 0, max = 0;
        var counts = new HashMap<Character, Integer>();

        for(int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            counts.merge(ch, 1, Integer::sum);
            max = Math.max(max, counts.get(ch));

            while((r - l + 1) - max > k) {
                counts.put(s.charAt(l), counts.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }   
        

        return res;
    }
}
