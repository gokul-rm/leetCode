class Solution {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(0, s, new ArrayList<>());
        return res;
    }

    void backtrack(int start,String s,List<String> list){
        if(start == s.length()){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int end = start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                    list.add(s.substring(start,end+1));
                    backtrack(end+1,s,list);
                    list.remove(list.size()-1);
                
            }
        }        
    }

    boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}