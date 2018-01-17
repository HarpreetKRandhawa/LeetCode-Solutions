class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] res = new int[triangle.size()+1];
        for(int i=triangle.size()-1; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                res[j] = triangle.get(i).get(j)+Math.min(res[j],res[j+1]);
            }
        }
        return res[0];
    }
}
