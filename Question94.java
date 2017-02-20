//Given a binary tree, return the inorder traversal of its nodes' values.

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
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> inorder = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode p = root;
    if(root == null){
        return inorder;
    }
    while(!stack.isEmpty() || p!= null){
        if(p!=null){
            stack.push(p);
            p = p.left;
        }
        else{
            TreeNode temp = stack.pop();
            inorder.add(temp.val);
            p = temp.right;
        }
    }
    return inorder;
    }
}
