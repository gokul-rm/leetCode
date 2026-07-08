class Solution {
    public String minWindow(String s, String t) {

        int[] map = new int[128];

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int begin = 0;
        int end = 0;

        int counter = t.length();

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (end < s.length()) {

            char ch = s.charAt(end);

            if (map[ch] > 0) {
                counter--;
            }

            map[ch]--;
            end++;

            while (counter == 0) {

                if (end - begin < minLength) {
                    minLength = end - begin;
                    start = begin;
                }

                char leftChar = s.charAt(begin);

                map[leftChar]++;

                if (map[leftChar] > 0) {
                    counter++;
                }

                begin++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}