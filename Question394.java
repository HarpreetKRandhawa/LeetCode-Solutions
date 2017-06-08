public class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<Integer>();
        Stack<String> strings = new Stack<String>();
        int c = 0;
        char[] a = s.toCharArray();
        StringBuilder res = new StringBuilder();
        String curr = "";
        for(int i=0; i<s.length(); i++){
            if(a[i]>='0' && a[i]<='9'){
                c = c*10 + (a[i]-'0');
            }
            else if(a[i] == '['){
                count.push(c);
                c = 0;
                strings.push(curr);
                curr = "";
            }
            else if(a[i]>='a' && a[i]<='z'){
                if(!count.isEmpty()){
                    curr += a[i];
                }
                else
                    res.append(a[i]);
            }
            else if(a[i] == ']'){
                int t = count.pop();
                if(count.isEmpty()){
                    for(int j=0; j<t; j++)
                        res.append(curr);
                    curr = strings.pop();
                }
                else{
                    String tmp = "";
                    for(int j=0;j<t;j++)
                        tmp+=curr;
                    curr = strings.pop()+tmp;
                }
            }
        }
        return res.toString();
    }
}
