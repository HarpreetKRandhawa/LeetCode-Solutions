class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] heights = new int[row][col+1];
        int maxArea=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == '0')
                    heights[i][j] = 0;
                else{
                    heights[i][j] = i==0?1:1+heights[i-1][j];
                }
            }
        }
        for(int i=0; i<row; i++){
            int area = histogram(heights[i]);
            if(area > maxArea)
                maxArea = area;
        }
        return maxArea;
    }
    public int histogram(int[] heights){
        Stack<Integer> st = new Stack<Integer>();
        int i, area, maxArea=-1;
        for(i=0; i<heights.length;){
            if(st.isEmpty() || heights[i] >= heights[st.peek()]){
                st.push(i);
                i++;
            }
            else{
                int top = st.pop();
                if(st.isEmpty())
                    area = heights[top]*i;
                else{
                    area = heights[top]*(i-st.peek()-1);
                }
                maxArea = Math.max(area,maxArea);
            }
        }
        while(!st.isEmpty()){
            int top = st.pop();
            if(st.isEmpty())
                area = heights[top]*i;
            else{
                area = heights[top]*(i-st.peek()-1);
            }
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
