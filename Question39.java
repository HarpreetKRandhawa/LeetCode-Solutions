class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        sumHelper(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    public void sumHelper(List<List<Integer>> res, List<Integer> l, int[] nums, int target, int start){
        if(target<0) return;
        else if(target == 0){
            res.add(new ArrayList<>(l));
        }
        for(int i=start; i<nums.length; i++){
            l.add(nums[i]);
            sumHelper(res,l,nums,target-nums[i],i);
            l.remove(l.size()-1);
        }
        
    }
}
