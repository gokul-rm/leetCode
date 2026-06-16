class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[126];

        for(char ch : s.toCharArray()) freq[ch]++;
        int even = 0;
        byte odd = 0;

        for(int i=0;i<126;i++){
            if(freq[i] %2 == 0){
                even += freq[i];
            } else{
                even += freq[i] - 1;
                odd = 1;
            }
        }
        return odd + even;
    }
}