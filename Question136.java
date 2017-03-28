//Given an array of integers, every element appears twice except for one. Find that single one.

public class Solution {
    public int singleNumber(int[] nums) {
      int x =0;
      if(nums.length == 1){
          return nums[0];
      }
      for(int i = 0; i<nums.length; i++){
            x = x ^ nums[i];    
      }
      return x;
    }
}
