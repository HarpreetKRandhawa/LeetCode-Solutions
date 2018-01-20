class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //Get lengths of arrays
        
        int l1 = nums1.length;
        int l2 = nums2.length;
        if(l1 > l2){
            return findMedianSortedArrays(nums2,nums1);
        }
        int start = 0, end = l1;
        while(start <= end){
            int part_X = (end+start)/2;
            int part_Y = (l1+l2+1)/2 - part_X;
            
            int maxLeftX = part_X == 0 ? Integer.MIN_VALUE:nums1[part_X-1];
            int minRightX = part_X == l1 ? Integer.MAX_VALUE: nums1[part_X];
            
            int maxLeftY = part_Y == 0 ? Integer.MIN_VALUE:nums2[part_Y-1];
            int minRightY = part_Y == l2 ? Integer.MAX_VALUE: nums2[part_Y];
            
            if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                if((l1+l2)%2 == 0)
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2.0;
                else
                    return (double)Math.max(maxLeftX,maxLeftY);
            }
            else if(maxLeftX > minRightY)
                end = part_X-1;
            else 
                start = part_X+1;
                
        }
        throw new IllegalArgumentException();
    }
}
