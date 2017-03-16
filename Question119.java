//Given an index k, return the kth row of the Pascal's triangle.
//For example, given k = 3,
//Return [1,3,3,1].

public class Solution {
    public List<Integer> getRow(int row) {
        List<Integer> res = new ArrayList<Integer>();
        if(row<0){
            return res;
        }
        res.add(1);
        for(int i = 1; i<= row; i++){
            for(int j = res.size()-2;j>=0;j--){
                res.set(j+1,res.get(j)+res.get(j+1));
            }
            res.add(1);
        }
        return res;
        
}
}
