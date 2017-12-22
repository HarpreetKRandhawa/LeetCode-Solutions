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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        bfs(ls,root,0);
        return ls;
    }
    public void bfs(List<List<Integer>> ls, TreeNode root, int level){
        if(root == null) return ;
        if(level >= ls.size())
            ls.add(0,new ArrayList<Integer>());
        bfs(ls, root.left, level+1);
        bfs(ls, root.right, level+1);
        ls.get(ls.size()-level-1).add(root.val);
    }
}
