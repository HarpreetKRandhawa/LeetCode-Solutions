//Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
//Your algorithm's runtime complexity must be in the order of O(log n).

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        if(nums.length == 0 || nums == null){
            return arr;
        }
        
        binarySearch(nums,0,nums.length-1,target,arr);
        return arr;
    }
    public void binarySearch(int[] nums, int low, int high, int target, int[] arr){
        if(low>high){
            return;
        }
        if(nums[low]==nums[high] && nums[low] == target){
            arr[0] = low;
            arr[1] = high;
            return;
        }
        int mid = low + (high - low)/2;
        if(target<nums[mid]){
            binarySearch(nums,low,mid-1,target,arr);
        }
        else
        if(target> nums[mid]){
            binarySearch(nums,mid+1,high,target,arr);
        }
        else{
            arr[0] = mid;
            arr[1] = mid;
            
            int t1 = mid;
            while(t1>low && nums[t1] == nums[t1-1]){
                t1--;
                arr[0] = t1;
            }
            
            int t2 = mid;
            while(t2<high && nums[t2] == nums[t2+1]){
                t2++;
                arr[1] = t2;
            }
            return;
        }
    }
}
