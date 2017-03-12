//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

//For example,
//Given nums = [0, 1, 3] return 2.

public class Solution {
    public int missingNumber(int[] nums) {
        if(nums== null || nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i)
                return i;
        }
        return i;
    }
}
