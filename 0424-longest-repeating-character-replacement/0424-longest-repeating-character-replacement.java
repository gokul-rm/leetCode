class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int res = 0, i = 0, maxFreq = 0;

        for (int j = 0; j < s.length(); j++) {
            freq[s.charAt(j)-'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(j)-'A']);

            while ((j - i + 1) - maxFreq > k) {
                char left = s.charAt(i);
                freq[s.charAt(i)-'A']--;
                i++;
            }

            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}