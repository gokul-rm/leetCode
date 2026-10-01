class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(int ch=0; ch<s.length(); ch++){

            char current = s.charAt(ch);
            if(!stack.isEmpty()){
                char peek = stack.peek();

                if(isPair(peek , current)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(current);
        }
        return(stack.isEmpty());
    }
        public boolean isPair(char one, char two){
            return (one == '(' && two == ')' || 
                    one == '[' && two == ']' ||
                    one == '{' && two == '}');
        }
}