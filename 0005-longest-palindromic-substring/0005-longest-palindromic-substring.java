class Solution {
    int idx = 0;
    int maxLen = 0;
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return "";

        for(int i=0; i<s.length();i++){
            getPalindrome(s,i,i);
            getPalindrome(s,i,i+1);
        }
        return s.substring(idx,maxLen+idx);
    }

    void getPalindrome(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        if(maxLen < right-left-1){
            maxLen = right-left-1;
            idx = left+1;
        }
    }
}