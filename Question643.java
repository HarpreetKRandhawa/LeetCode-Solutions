class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        long max=Integer.MIN_VALUE, sum;
        for(int i=0; i<nums.length; i++){
            if(i+k > nums.length)
                break;
            sum = 0;
            for(int j=i; j<k+i; j++){
                sum += nums[j];
            }
            max = Math.max(max,sum);
        }
        return max/1.0/k;
    }
}
