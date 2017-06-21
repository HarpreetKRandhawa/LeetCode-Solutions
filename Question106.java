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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inStart = 0;
        int inEnd = inorder.length-1;
        int postStart = 0;
        int postEnd = postorder.length-1;
        
        return construct(inorder,inStart,inEnd,postorder,postStart,postEnd);
    }
    public TreeNode construct(int[] inOrder, int inStart, int inEnd, int[] postOrder, int postStart, int postEnd){
        if(inStart > inEnd || postStart > postEnd)
            return null;
        
        int val = postOrder[postEnd];
        TreeNode t = new TreeNode(val);
        int k=0;
        for(int i=0; i<inOrder.length; i++){
            if(inOrder[i] == val){
                k = i;
                break;
            }
        }
        t.left = construct(inOrder,inStart,k-1,postOrder,postStart,postStart+k-(inStart+1)) ;
        t.right = construct(inOrder,k+1,inEnd,postOrder,postStart+k-inStart,postEnd-1);
        return t;
    }
}
