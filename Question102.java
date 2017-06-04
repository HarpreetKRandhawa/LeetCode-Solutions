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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        
        if(root == null)
            return res;
            
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        
        current.add(root);
        while(!current.isEmpty()){
            TreeNode r = current.remove();
            if(r.left != null)
                next.add(r.left);
            if(r.right != null)
                next.add(r.right);
            l.add(r.val);
            if(current.isEmpty()){
                current = next;
                next = new LinkedList<TreeNode>();
                res.add(l);
                l = new ArrayList<Integer>();
            }
        }
        return res;
    }
}
