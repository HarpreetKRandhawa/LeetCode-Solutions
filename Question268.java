//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

//For example,
//Given nums = [0, 1, 3] return 2.

public class Solution {
    public int missingNumber(int[] nums) {
        if(nums== null || nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);
        int left = 0, right = nums.length;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]>mid){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return right;
    }
}
