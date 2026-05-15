class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] counts = new int[26];

        for(int idx = 0; idx < s.length(); idx++) {
            counts[s.charAt(idx) - 'a']++;
            counts[t.charAt(idx) - 'a']--;
        }

        for(int count: counts) {
            if(count != 0) return false;
        }

        return true;
    }
}