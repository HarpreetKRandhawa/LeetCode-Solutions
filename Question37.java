class Solution {
    public void solveSudoku(char[][] board) {
        if(board.length == 0 || board == null)
            return;
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char c='1'; c<='9'; c++){
                        if(isValid(board,i,j,c)){
                            board[i][j] = c;
                            if(solve(board))
                                return true;
                            else
                                board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int rowIndex, int colIndex, char c){
        for(int k=0; k<9; k++){
            if(board[rowIndex][k] != '.' && board[rowIndex][k] == c) return false;
            if(board[k][colIndex] != '.' && board[k][colIndex] == c) return false;
            
            if(board[3*(rowIndex/3)+k/3][3*(colIndex/3)+k%3] != '.' && board[3*(rowIndex/3)+k/3][3*(colIndex/3)+k%3] == c)
                return false;
        }
        return true;
    }
}
