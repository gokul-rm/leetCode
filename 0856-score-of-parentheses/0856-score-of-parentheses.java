class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int val = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(val);
                val = 0;
            } else{
                val = stack.pop() +  Math.max(2*val
                ,1);
            }
        }
        return val;
    }
}