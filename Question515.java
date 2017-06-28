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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        helper(result, root, 0);
        return result;
    }
    
    public void helper(List<Integer> res, TreeNode root, int depth){
        if(root == null)    
            return;
        if(depth == res.size())
            res.add(root.val);
        else
            res.set(depth, Math.max(res.get(depth),root.val));
        helper(res,root.left,depth+1);
        helper(res,root.right,depth+1);
    }
}
