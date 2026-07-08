class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            if(isAnagram(s.substring(i,i+p.length()),p))
                res.add(i);
        }
        return res;
    }
    boolean isAnagram(String s,String p){
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : p.toCharArray()){
            freq[ch - 'a']--;
        }
        for(int num : freq){
            if(num != 0) return false;
        }
        return true;
    }
}