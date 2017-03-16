//Given an array of size n, find the majority element. 
//The majority element is the element that appears more than ⌊ n/2 ⌋ times.

public class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int match = nums[0];
        int count = 0;
        for(int i =1; i<nums.length; i++){
            if(nums[i] == match){
                count++;
                if(count >= nums.length/2){
                return nums[i];
                }
            }
            else{
                match = nums[i];
                count = 0;
            }
        }
    return 0;    
    }
}
