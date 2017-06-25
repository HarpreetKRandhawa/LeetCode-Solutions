public class Solution {
    public int countComponents(int n, int[][] edges) {
        int[] roots = new int[n];
        for(int i=0; i<n; i++)
            roots[i] = i;
        
        for(int[] e : edges){
            int root1 = countComponentsHelper(roots, e[0]);
            int root2 = countComponentsHelper(roots, e[1]);
            if(root1 != root2){
                roots[root1] = root2;
                n--;
            }
        }
        return n;
    }
    
    public int countComponentsHelper(int[] roots, int val){
        while(roots[val] != val){
            val = roots[val];
        }
        return val;
    }
}
