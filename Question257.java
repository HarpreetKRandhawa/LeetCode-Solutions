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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if(root == null){
            return paths;
        }
        List<String> leftPath = binaryTreePaths(root.left);
        List<String> rightPath = binaryTreePaths(root.right);
        for(String t: leftPath){
            paths.add(root.val+"->"+t);
        }
        for(String t: rightPath){
            paths.add(root.val+"->"+t);
        }
        if(paths.size() == 0){
            paths.add(""+root.val);
        }
        return paths;
    }
}
