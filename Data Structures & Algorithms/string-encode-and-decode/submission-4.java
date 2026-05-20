class Solution {

    public String encode(List<String> strs) {
        var sizes = strs.stream().map(String::length).map(String::valueOf).collect(Collectors.joining(","));
        return sizes.isBlank() ? "" : "%s#%s".formatted(sizes, String.join("", strs));
    }

    public List<String> decode(String str) {
        var result = new ArrayList<String>();

        if (str.isEmpty()) return result;

        var parts = str.split("#", 2);
        var idx = 0;

        for (String s : parts[0].split(",")) {
            int len = Integer.parseInt(s);
            result.add(parts[1].substring(idx, idx + len));
            idx += len;
        }
        return result;
    }
}