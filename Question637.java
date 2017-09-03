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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l = new ArrayList<Double>();
        Queue<TreeNode> q = new LinkedList();
        
        if(root == null)
            return l;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            double sum = 0.0;
            for(int i=0; i<n; i++){
                TreeNode a = q.poll();
                sum += a.val;
                if(a.left != null) q.offer(a.left);
                if(a.right != null) q.offer(a.right);
            }
            l.add(sum/n);
        }
        return l;
    }
}
