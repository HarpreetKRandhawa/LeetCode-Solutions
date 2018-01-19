public class Solution {
    public String reverseWords(String s) {
        String b="";
        String[] str = s.trim().split("\\s+");
        Stack<String> st = new Stack<String>();
        for(String a:str)
            st.push(a);
        while(!st.isEmpty()){
            b += st.pop()+" ";
        }
        return b.trim();
    }
}
