class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;

        for(String ch : tokens){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int b =stack.pop();
                int a =stack.pop();

                switch(ch){
                    case "+" : stack.push(a+b);
                               break;
                    case "-" : stack.push(a-b);
                               break;
                    case "*" : stack.push(a*b);
                               break;
                    case "/" : stack.push(a/b);
                               break;
                }
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}