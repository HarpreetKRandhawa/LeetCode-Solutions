//Given numRows, generate the first numRows of Pascal's triangle.

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows == 0){
            return res;
        }
        for(int i = 0; i<numRows;i++){
            List<Integer> curr = new ArrayList<Integer>();
            for(int j =0;j<=i;j++){
                if(j == 0){
                    curr.add(1);
                }
                else if(j<i){
                    int sum = res.get(i-1).get(j-1) + res.get(i-1).get(j);
                    curr.add(sum);
                }
                else if(j == i){
                    curr.add(1);
                }
            }
            res.add(curr);
        }
        return res;
    }
}
