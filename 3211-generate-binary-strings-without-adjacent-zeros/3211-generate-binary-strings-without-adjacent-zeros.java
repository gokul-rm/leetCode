class Solution {
    List<String> list = new ArrayList<>();
    public List<String> validStrings(int n) {
        backTrack(n, new StringBuilder());
        return list;
    }

    void backTrack(int n, StringBuilder sb){
        if(sb.length() == n){
            list.add(sb.toString());
            return;
        }

        sb.append("1");
        backTrack(n,sb);
        sb.setLength(sb.length()-1);

        if(sb.length() == 0 || sb.charAt(sb.length()-1) == '1'){
            sb.append("0");
        backTrack(n,sb);
        sb.setLength(sb.length()-1);
        }
        
    }
}