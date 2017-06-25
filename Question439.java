public class Solution {
    public String parseTernary(String expression) {
        if(expression == null || expression.length() == 0)
            return "";
        
        Deque<Character> st = new LinkedList<>();
        for(int i=expression.length()-1; i>=0 ;i--){
            char c= expression.charAt(i);
            if(!st.isEmpty() && st.peek() == '?'){
                st.pop();
                char first = st.pop();
                st.pop();
                char second = st.pop();
                if(c == 'T')
                    st.push(first);
                else
                    st.push(second);
            }
            else
                st.push(c);
        }
        return String.valueOf(st.peek());
    }
}
