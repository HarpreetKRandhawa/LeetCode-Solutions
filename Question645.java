class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i]))
                res[0] = nums[i];
            set.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(!set.contains(i+1)){
                res[1] = i+1;
                break;
            }
        }
        return res;
    }
}
