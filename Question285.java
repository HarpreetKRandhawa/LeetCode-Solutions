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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null)
            return null;
            
        TreeNode next = null;
        TreeNode curr = root;
        
        while(curr != null && curr.val != p.val){
            if(curr.val > p.val){
                next = curr;
                curr = curr.left;
            }
            else
                curr = curr.right;
        }
        
        if(curr == null){
            return null;
        }
        
        if(curr.right == null)
            return next;
            
        curr = curr.right;
        while(curr.left != null)
            curr = curr.left;
            
        return curr;
    }
}
