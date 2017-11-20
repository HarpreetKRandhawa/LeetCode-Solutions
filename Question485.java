class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int max=0;
        int count=0;
        for(Integer i: nums){
            if(i == 1){
                count++;
            }
            if(i == 0){
                count = 0;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
