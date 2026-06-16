class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int length = 0;
        boolean isOdd = false;

        for(char ch : s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);

        for(int num : map.values()){
            if(num % 2 == 0) length += num;
            else {length += num -1; isOdd = true; }
        }
        return isOdd ? length+1 : length;
    }
}