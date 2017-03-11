//Given an unsorted integer array, find the first missing positive integer.

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for(int i= 0;i<len;i++){
            while(nums[i] != i+1){
                if(nums[i]<=0 || nums[i]>=len)
                    break;
                if(nums[i] == nums[nums[i]-1])
                    break;
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }
        for(int i=0;i<len;i++){
            if(nums[i] != i+1)
                return i+1;
        }
        return len+1;
    }
}
