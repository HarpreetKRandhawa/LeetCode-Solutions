class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int i=0, j=1;
        while(i<nums.length && j<nums.length){
            if(j<=i || nums[i]+k > nums[j])
                j++;
            else if((i>0 && nums[i] == nums[i-1])||(nums[i]+k < nums[j]))
                i++;
            else{
                count++;
                i++;
            }
        }
        return count;
    }
}
