class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int open = 0;


        for(char ch : s.toCharArray()){
            if((ch >= '0'  && ch<='9') || ch == '+' || ch == '-' || ch == '*' || ch == '/') continue;
            if(ch == '('){
                open++;
                max = Math.max(open,max);
            } else if(ch == ')'){
                open--;
            }
        }
        return max;
    }
}