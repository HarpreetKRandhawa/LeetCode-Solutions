//Given a binary tree, return the preorder traversal of its nodes' values.

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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack =  new Stack<TreeNode>();
        ArrayList<Integer> preorder = new ArrayList<Integer>();
        
        if(root == null){
            return preorder;
        }
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            preorder.add(temp.val);
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
        return preorder;
    }
}
