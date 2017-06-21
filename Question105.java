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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart = 0;
        int preEnd = preorder.length - 1;
        int inStart = 0;
        int inEnd = inorder.length - 1;
        
        return buildTreeHelp(preorder,preStart,preEnd,inorder,inStart,inEnd);
    }
    public TreeNode buildTreeHelp(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd){
        if(preStart>preEnd || inStart>inEnd)
            return null;
        
        int val = preOrder[preStart];
        TreeNode p = new TreeNode(val);
        int k=0;
        
        for(int i=0; i<inOrder.length; i++){
            if(val == inOrder[i]){
                k = i;
                break;
            }
        }
        
        p.left = buildTreeHelp(preOrder,preStart+1,preStart+(k-inStart),inOrder,inStart,k-1);
        p.right = buildTreeHelp(preOrder,preStart+(k-inStart)+1,preEnd,inOrder,k+1,inEnd);
        
        return p;
    }
}
