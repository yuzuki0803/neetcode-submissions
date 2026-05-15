class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];

        for(char ch: s.toCharArray()) {
            counts[ch - 97]++;
        }

        for(char ch: t.toCharArray()) {
            counts[ch - 97]--;
        }

        for(int count: counts) {
            if(count != 0) return false;
        }

        return true;
    }
}