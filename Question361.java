public class Solution {
    public int maxKilledEnemies(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int r = grid.length;
        int c = grid[0].length;
        
        int max = 0;
        int row = 0;
        int[] col = new int[grid[0].length];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(j==0 || grid[i][j-1] == 'W')
                    row = updateRow(i,j,grid);
                if(i==0 || grid[i-1][j] == 'W')
                    col[j] = updateCol(i,j,grid);
                if(grid[i][j] == '0')
                    max = Math.max(max,row+col[j]);
            }
        }
        return max;
    }
    private int updateRow(int i, int j, char[][] grid){
        int counter = 0;
        for(int k=j; k<grid[0].length; k++){
            if(grid[i][k] == 'W')
                break;
            else if(grid[i][k] == 'E')
                counter++;
        }
        return counter;
    }
    private int updateCol(int i, int j, char[][] grid){
        int counter = 0;
        for(int k=i; k<grid.length; k++){
            if(grid[k][j] == 'W')
                break;
            else if(grid[k][j] == 'E')
                counter++;
        }
        return counter;
    }
}
