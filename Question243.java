//Solution 1: O(n) times time and O(1) space Complexity
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        if(nums[0] != nums[1])
            return nums[0];
        for(int i=1; i<nums.length-1; i++){
            if(!(nums[i-1] == nums[i] || nums[i] == nums[i+1]))
                return nums[i];
        }
        if(nums[nums.length-2] != nums[nums.length-1])
            return nums[nums.length-1];
        return -1;
    }
}

//Solution 2: O(logg n) times time and O(1) times space Complexity
//Solution improved using Binary Search
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int res = binarySearch(nums,low,high);
        return res;
    }
    public int binarySearch(int[] a, int low, int high){
        if(low > high)
            return -1;
        if(low == high){
            return a[low];
        }
        int mid = low + (high-low)/2;
        if(mid%2 == 0){
            if(a[mid] == a[mid+1])
                return binarySearch(a,mid+2,high);
            else
                return binarySearch(a,low,mid);
        }
        else{
            if(a[mid] == a[mid-1])
                return binarySearch(a,mid+1,high);
            else
                return binarySearch(a,low,mid-1);
        }
    }
}
