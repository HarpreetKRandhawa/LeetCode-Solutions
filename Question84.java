class Solution {
    public int largestRectangleArea(int[] heights) {
        //Stack based approach O(n)
        int area, maxArea=-1, top;
        Stack<Integer> st = new Stack<Integer>();
        int i;
        for(i=0; i<heights.length;){
            if(st.isEmpty() || heights[i] >= heights[st.peek()]){
                st.push(i);
                i++;
            }
            else if(heights[i] < heights[st.peek()]){
                top = st.pop();
                if(!st.isEmpty())
                    area = heights[top] * (i-st.peek()-1);
                else
                    area = heights[top] * i;
                maxArea = Math.max(area,maxArea);
            }
        }
        System.out.println(i);
        while(!st.isEmpty()){
            top = st.pop();
            if(!st.isEmpty())
                area = heights[top] * (i-st.peek()-1);
            else
                area = heights[top] * i;
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
