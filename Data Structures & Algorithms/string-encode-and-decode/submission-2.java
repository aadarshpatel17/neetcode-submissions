class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length())
                    .append("#")
                    .append(str);
        }
        return sb.toString();
    }

    //  5#Hello5#World ->  [Hello, World]
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // Parse the length
            int length = 0;
            while (str.charAt(i) != '#') {
                length = length * 10 + (str.charAt(i) - '0');
                i++;
            }
            // Skip '#'
            i++;
            // Read exactly 'length' characters
            result.add(str.substring(i, i + length));
            // Move to the next encoded string
            i += length;
        }
        return result;
    }
}
