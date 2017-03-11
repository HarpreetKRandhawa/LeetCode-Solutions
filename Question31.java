//Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0){
            return ;
        }
        int p1=0,p2=0;
        for(int i = nums.length-2; i>= 0; i--){
            if(nums[i] > nums[i+1]){
                p1 = i;
                break;
            }
        }
        for(int i = nums.length-1; i>= 0; i--){
            if(nums[i] > nums[p1]){
                p2 = nums[i];
            }
        }
        if(p1 == 0 && p2 == 0){
            reverse(nums,0,nums.length-1);
            return ;
        }
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
        
        if(p1<nums.length-1){
            reverse(nums,p1+1,nums.length-1);
        }
    }
    public void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
