//Given a collection of distinct numbers, return all possible permutations.

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
         ArrayList<List<Integer>> rst = new ArrayList<List<Integer>>();
         if(nums == null)
            return rst;
            
        ArrayList<Integer> lst = new ArrayList<Integer>();
        helper(rst,lst,nums);
        return rst;
    }
    
    public void helper(ArrayList<List<Integer>> rst, ArrayList<Integer> lst, int[] nums){
        if(lst.size() == nums.length){
            rst.add(new ArrayList<Integer>(lst));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(lst.contains(nums[i]))
                continue;
            lst.add(nums[i]);
            helper(rst,lst,nums);
            lst.remove(lst.size()-1);
        }
    }
}
