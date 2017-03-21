//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        parenthesis(res,"",n,n);
        return res;
    }
    void parenthesis(List<String> res, String s, int left, int right){
        if(left>right){
            return;
        }
        if(left ==0 && right ==0){
            res.add(s);
            return;
        }
        if(left>0){
            parenthesis(res,s+'(',left-1,right);
        }
        if(right>0){
            parenthesis(res,s+')',left,right-1);
        }
    }
}
