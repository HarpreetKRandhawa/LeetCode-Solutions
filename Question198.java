//House Robber
public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int[] a = new int[nums.length];
        a[0] = nums[0];
        a[1] = Math.max(nums[0],nums[1]);
        for(int i=2; i<nums.length; i++){
            a[i] = Math.max(a[i-1],a[i-2]+nums[i]);
        }
        return a[a.length-1];
    }
}
