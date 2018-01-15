class Solution {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        combineHelper(res, new ArrayList<Integer>(), 1, n, k);
        return res;
    }
    public static void combineHelper(List<List<Integer>> res, List<Integer> sub, int start, int n, int k ){
        if(sub.size() == k){
            res.add(new ArrayList<Integer>(sub));
            return;
        }
        for(int i=start; i<= n; i++){
            sub.add(i);
            combineHelper(res,sub,i+1,n,k);
            sub.remove(sub.size()-1);
        }
    }
}
