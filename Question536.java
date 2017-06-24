/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode str2tree(String s) {
        if(s == null || s.length() == 0)
            return null;
        int firstParen = s.indexOf('(');
        int val = (firstParen == -1 ? Integer.parseInt(s):Integer.parseInt(s.substring(0,firstParen)));
        
        TreeNode curr = new TreeNode(val);
        if(firstParen == -1)
            return curr;
        int start = firstParen;
        int leftParen = 0;
        for(int i=start; i<s.length(); i++){
            if(s.charAt(i) == '(')
                leftParen++;
            if(s.charAt(i) == ')')
                leftParen--;
            if(leftParen == 0 && (start == firstParen)){
                curr.left = str2tree(s.substring(start+1,i));
                start = i+1;
            }
            else if(leftParen == 0)
                curr.right = str2tree(s.substring(start+1,i));
        }
        return curr;
    }
}
