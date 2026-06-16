class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == '%') sb.reverse();
            else if(ch == '*'){
                if(sb.length() > 0)sb.setLength(sb.length() - 1);} 
            else if(ch == '#'){sb.ensureCapacity(sb.length() * 2);
                sb.append(sb); }
            else 
            sb.append(ch);
        }
        return sb.toString();
    }
}