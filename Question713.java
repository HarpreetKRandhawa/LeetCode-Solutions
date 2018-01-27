class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        int i=0, j=0, prod=1, count=0;
        int len = nums.length;
        while(j < len){
            prod *= nums[j];
            while(i <= j && prod >= k){
                prod /= nums[i];
                i++;
            }
            count += (j-i+1);
            j++;
        }
        return count;
    }
}
