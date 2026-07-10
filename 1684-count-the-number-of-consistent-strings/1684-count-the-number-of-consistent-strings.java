class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int count = 0;

        for(char ch : allowed.toCharArray()) set.add(ch);
        for(String s : words){
            boolean isTrue = true;
            for(int i=0;i<s.length();i++){
                if(!set.contains(s.charAt(i))) { isTrue = false;break;}
            }
            if(isTrue)count++;
        }
        return count;
    }
}