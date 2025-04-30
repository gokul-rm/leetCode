class Solution {
    public int strStr(String haystack, String needle) {
        int word = haystack.length();
        int subword = needle.length();

        if (word == 0) return 0;
        if (subword > word) return -1;

        for (int i = 0; i <= word - subword; i++) {
            if (haystack.substring(i, i + subword).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
