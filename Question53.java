public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int[]a = new int[nums.length];
        int max = nums[0];
        a[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            a[i] = Math.max(nums[i],nums[i]+a[i-1]);
            max = Math.max(max,a[i]);
        }
        return max;
    }
}
