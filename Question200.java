public class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        
        int count =0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == '1'){
                    count++;
                    helper(grid,i,j);
                }
            }
        }
        return count;
    }
    public void helper(char[][] grid, int i, int j){
        int row = grid.length;
        int col = grid[0].length;
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = 'X';
        helper(grid,i-1,j);
        helper(grid,i+1,j);
        helper(grid,i,j-1);
        helper(grid,i,j+1);
    }
}
