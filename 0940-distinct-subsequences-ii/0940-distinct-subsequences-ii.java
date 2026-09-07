class Solution {
    public int distinctSubseqII(String s) {
        long MOD = 1000000007;
        long a = 0;
        long[] freq = new long[26];

        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            long sub = (a+1-freq[idx] + MOD) % MOD;
            a = (a+sub) % MOD;
            freq[idx] = (freq[idx] + sub) % MOD;
    }
        return (int)a;
    }
}