//Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
//n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
//Find two lines, which together with x-axis forms a container, such that the container contains the most water.

public class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length<2)
            return 0;
        int tot_containers = height.length;
        int first = 0, last = tot_containers-1, max = 0;
        while(first<last){
            max = Math.max(max,(last-first)*Math.min(height[last],height[first]));
            if(height[first]<height[last])
                first++;
            else
                last--;
        }
       return max; 
    }
}

