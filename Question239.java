public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0){
            return new int[0];
        }
        int[] max = new int[nums.length-k+1];
        int left = 0;
        int right = k-1;
        while(right < nums.length){
            max[left] = nums[left];
            for(int i = left; i<=right; i++){
                max[left] = Math.max(max[left],nums[i]);
            }
            left++;
            right++;
        }
        return max;
    }
}
