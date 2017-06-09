public class Solution {
    public int trap(int[] height) {
        int res = 0;
        if(height == null || height.length <= 2)
            return res;
        
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        
        int max = height[0];
        left[0] = max;
        for(int i=1; i<height.length; i++){
            if(max < height[i])
                max = height[i];
            left[i] = max;
        }
        
        max = height[height.length - 1];
        right[height.length-1] = max;
        for(int i=height.length-2; i >= 0; i--){
            if(max < height[i])
                max = height[i];
            right[i] = max;
        }
        
        for(int i=0; i<height.length; i++){
            res += Math.min(left[i],right[i]) - height[i];
        }
        return res;
    }
}
