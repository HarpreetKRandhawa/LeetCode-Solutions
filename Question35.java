//Given a sorted array and a target value, return the index if the target is found. 
//If not, return the index where it would be if it were inserted in order.

//You may assume no duplicates in the array.
//Here are few examples.
//[1,3,5,6], 5 → 2
//[1,3,5,6], 2 → 1

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null){
            return -1;
        }
        else if(target>nums[nums.length-1]){
            return nums.length;
        }
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int m = (i+j)/2;
            if(target > nums[m]){
                i = m+1;
            }
            else{
                j = m;
            }
        }
        return j;
        
    }
}
