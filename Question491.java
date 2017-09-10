class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> lst = new ArrayList<Integer>();
        Set<List<Integer>> rst = new HashSet<List<Integer>>();
        findSubsequencesHelper(rst,lst,0,nums);
        List result = new ArrayList(rst);
        return result;
    }
    public void findSubsequencesHelper(Set<List<Integer>> rst, List<Integer> lst, int index, int[] nums){
        if(lst.size() >= 2)
            rst.add(new ArrayList<Integer>(lst));
        
        for(int i=index; i<nums.length; i++){
            if(lst.size() == 0 || lst.get(lst.size() - 1) <= nums[i]){
                lst.add(nums[i]);
                findSubsequencesHelper(rst,lst,i+1,nums);
                lst.remove(lst.size()-1);
            }
        }
    }
}
