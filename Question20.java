public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
            Character c = s.charAt(i);
            if(c =='(' || c=='[' || c=='{'){
                stack.push(c);
                continue;
            }
            if(!stack.isEmpty() && func(stack.peek(),c)){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
        
    }
    private boolean func(char s, char c){
        return ((s == '(' && c == ')') || (s == '{' && c == '}') || (s == '[' && c == ']'));
    }
}
