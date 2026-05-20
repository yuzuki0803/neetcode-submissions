class Solution {

    public String encode(List<String> strs) {
        return strs.stream().map(s -> "%d#%s".formatted(s.length(), s)).collect(Collectors.joining());
    }

    public List<String> decode(String str) {
        var result = new ArrayList<String>();

        int idx = 0;
        while (idx < str.length()) {
            var start = str.indexOf('#', idx);
            var len = Integer.parseInt(str.substring(idx, start));
            idx = start + 1;
            result.add(str.substring(idx, idx + len));
            idx += len;
        }
        return result;
    }
}