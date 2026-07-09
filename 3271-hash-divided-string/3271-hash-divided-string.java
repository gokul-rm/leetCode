class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i=i+k){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum += s.charAt(j) - 'a';
            }
            int hashedChar = sum % 26;
            sb.append((char) ('a' + hashedChar));
        }
        return sb.toString();
    }
}