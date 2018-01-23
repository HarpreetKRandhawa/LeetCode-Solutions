class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if(nums.length == 0 || nums == null)
            return res;
        int count=0, ele=0, mark=nums.length/3;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == nums[ele]){
                count++;
                if(count > mark && !res.contains(nums[i]))
                    res.add(nums[i]);
            }
            else{
                ele = i;
                count = 0;
                i = i-1;
            }
        }
        return res;
    }
}
