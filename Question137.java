//Given an array of integers, every element appears three times except for one, which appears exactly once. 
//Find that single one.

public class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int ones=0, twos=0, threes=0;
        for(int i = 0; i<nums.length; i++){
            twos = twos | (ones & nums[i]);
            ones = ones ^ nums[i];
            threes = ones & twos;
            twos = twos & ~threes;
            ones = ones & ~threes;
        }
        return ones;
    }
}
