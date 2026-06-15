class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] counter = new int[26];

        for(char ch: s1.toCharArray()) {
            counter[ch - 'a'] += 1;
        }

        for(int idx = 0; idx <= s2.length() - s1.length(); idx++) {
            int[] cur = new int[26];
            for(int j = idx; j < idx + s1.length(); j++) {
                cur[s2.charAt(j) - 'a'] += 1;
            }

            if(isEqual(counter, cur)) return true;
        }

        return false;
    }

    private boolean isEqual(int[] arr1, int[] arr2) {
        return IntStream.range(0, 26).allMatch(x -> arr1[x] == arr2[x]);
    }
}
