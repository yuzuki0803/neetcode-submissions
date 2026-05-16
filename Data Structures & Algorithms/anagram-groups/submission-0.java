class Solution {

    private int[] createCountArray(String str) {
        int[] res = new int[26];

        for(char ch: str.toCharArray()) {
            res[ch - 'a']++;
        }

        return res;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String, List<String>>();

        for(String str: strs){
            var counts = Arrays.toString(createCountArray(str));
            map.computeIfAbsent(counts, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
