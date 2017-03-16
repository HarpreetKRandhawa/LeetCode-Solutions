//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int i=0, j=0, k=0;
        while(i<nums1.length &&j < nums2.length){
            arr[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while(i<nums1.length){
            arr[k++] = nums1[i++];
        }
        while(j<nums2.length){
            arr[k++] = nums2[j++];
        }
        double median = 0.0;
        if(k%2 == 0){
            return (arr[k/2]+arr[k/2-1])/2.0;
        }
        else{
            return (arr[k/2]);
        }
    }
}
