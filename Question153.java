class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        
        if(nums.length == 0 || nums == null)
            return -1;
        
        if(nums.length == 1)
            return nums[left];
        
        if(nums[left] < nums[right])
            return nums[left];
        
        while(left <= right){
            if(right - left == 1)
                return nums[right];
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right])
                left = mid;
            else
                right = mid;
        }
        return nums[left];
    }
}
