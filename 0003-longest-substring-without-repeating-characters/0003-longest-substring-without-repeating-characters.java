class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int start = 0;
        int end = 0;
        int max = 0;

        while(end < s.length()){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(end));
            max = Math.max(end-start+1,max);
            end++;
        }
        return max;
    }
}