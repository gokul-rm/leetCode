class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int i = 0;
        int ones = 0;

        String ans = "";

        for (int j = 0; j < s.length(); j++) {

            if (s.charAt(j) == '1') {
                ones++;
            }

            while (ones > k) {
                if (s.charAt(i) == '1') {
                    ones--;
                }
                i++;
            }

            while (ones == k) {

                String cur = s.substring(i, j + 1);

                if (ans.equals("") ||
                        cur.length() < ans.length() ||
                        (cur.length() == ans.length() &&
                                cur.compareTo(ans) < 0)) {
                    ans = cur;
                }

                if (s.charAt(i) == '1') {
                    ones--;
                }
                i++;
            }
        }

        return ans;
    }
}