class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0 || grid == null)
            return 0;
        int row = grid.length;
        int col = grid[0].length;
        int max = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1){
                    int area = dfs(grid,i,j,row,col,0);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid, int i, int j, int row, int col, int area){
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == 0) {
            return area;
        }
        grid[i][j] = 0;
        area++;
        area = dfs(grid,i+1,j,row,col,area);
        area = dfs(grid,i-1,j,row,col,area);
        area = dfs(grid,i,j+1,row,col,area);
        area = dfs(grid,i,j-1,row,col,area);
        return area;
    }
}
