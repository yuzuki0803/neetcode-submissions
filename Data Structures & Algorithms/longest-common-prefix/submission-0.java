class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Arrays.stream(strs).map(String::length).min(Integer::compareTo).orElseThrow();

        int idx = 0;
        String res = "";

        while(idx < min) {
            char curr = strs[0].charAt(idx);
            for(String str: strs) {
                if(str.charAt(idx) != curr) return res;
            }
            res += curr;
            idx++;
        }

        return res;
    }
}