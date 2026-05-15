class Solution {
    public String longestCommonPrefix(String[] strs) {

        for(int idx = 0; idx < strs[0].length(); idx++) {
            for(String str: strs) {
                if(idx == str.length() || strs[0].charAt(idx) != str.charAt(idx)) {
                    return str.substring(0, idx);
                }
            }
        }

        return strs[0];
    }
}