class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        //Arrays.sort(nums);
        helper(lst, new ArrayList<>(), nums,0);
        return lst;
    }
    public void helper(List<List<Integer>> lst, List<Integer> temp, int[] nums, int start){
        lst.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++){
            temp.add(nums[i]);
            helper(lst,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
