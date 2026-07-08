public class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        int[] map = new int[128];

        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int counter = t.length();
        int begin = 0;
        int end = 0;
        int d = Integer.MAX_VALUE;
        int head = 0;

        while (end < s.length()) {
            if (map[s.charAt(end++)]-- > 0) {
                counter--;
            }

            while (counter == 0) {
                if (end - begin < d) {
                    d = end - (head = begin);
                }
                if (map[s.charAt(begin++)]++ == 0) {
                    counter++;
                }
            }
        }

        return d == Integer.MAX_VALUE ? "" : s.substring(head, head + d);
    }
}
