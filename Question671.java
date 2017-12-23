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
    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        if(root != null)
            dfs(root,ts);
        ts.remove(ts.first());
        if(ts.size() == 0)
            return -1;
        return ts.first();
    }
    public void dfs(TreeNode root, TreeSet<Integer> ts){
        if(root == null) return;
        dfs(root.left,ts);
        ts.add(root.val);
        dfs(root.right,ts);
    }
}
