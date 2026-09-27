class Solution {
    public String reversePrefix(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i= n-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        for(int i=n;i<s.length();i++) sb.append(s.charAt(i));
    return sb.toString();

    }
}