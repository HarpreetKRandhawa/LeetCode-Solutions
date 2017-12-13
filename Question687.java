/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int longestUnivaluePath(TreeNode root) {
        int[] res = new int[1];
        if(root != null)
            dfs(root, res);
        return res[0];
    }
    private int dfs(TreeNode node, int[] res){
        int l = node.left!=null?dfs(node.left,res):0;
        int r = node.right!=null?dfs(node.right,res):0;
        int left = (node.left!=null&&node.left.val==node.val)?l+1:0;
        int right = (node.right!=null&&node.right.val==node.val)?r+1:0;
        res[0] = Math.max(res[0],left+right);
        return Math.max(left,right);
    }
}
