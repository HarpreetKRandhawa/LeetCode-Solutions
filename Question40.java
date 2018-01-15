class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumHelper(candidates, new ArrayList<Integer>(), res, target, 0);
        return res;
    }
    public void combinationSumHelper(int[] candidates, List<Integer> l, List<List<Integer>> res, int target, int start){
        if(target<0)
            return;
        if(target == 0){
            res.add(new ArrayList<Integer>(l));
            return;
        }
        for(int i=start; i<candidates.length; i++){
            if(i > start && candidates[i] == candidates[i-1]) continue;
            l.add(candidates[i]);
            combinationSumHelper(candidates, l, res, target-candidates[i], i+1);
            l.remove(l.size()-1);
        }
    }
}
