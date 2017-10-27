//Given a binary tree, determine if it is a valid binary search tree (BST).
//Assume a BST is defined as follows:
//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.

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
    public boolean isValidBST(TreeNode root) {
        return func(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
    public boolean func(TreeNode p, double low, double high){
        if(p == null){
            return true;
        }
        if(p.val<= low || p.val >= high){
            return false;
        }
        
        return func(p.left,low,p.val) && func(p.right,p.val,high);
    }
}

//Solution 2
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
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
        root = stack.pop();
        if(pre != null && root.val <= pre.val) return false;
        pre = root;
        root = root.right;    
        }
        return true;
    }
}
