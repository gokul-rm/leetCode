class Solution {
    public int minInsertions(String s) {
        s = s.replace("))","]");

        int ins = 0;
        int left = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(') left++;

            else if((ch == ']' || ch == ')') && left > 0){
                ins += ch == ')' ? 1 : 0;
                left--;
            }
            else{
                ins += ch == ')' ? 2 : 1;
            }
        }
        return ins + left*2;
    }
}