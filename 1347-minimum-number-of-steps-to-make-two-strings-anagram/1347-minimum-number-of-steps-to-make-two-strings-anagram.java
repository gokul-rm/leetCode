class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            freq[ch-'a']--;
        }
        int res = 0;

        for(int num : freq){
            if(num > 0)
                res+=num;
        }
        return res;
    }
}