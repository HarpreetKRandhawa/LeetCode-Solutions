class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!isPartiallyValid(board,i,0,i,8)) return false;
            if(!isPartiallyValid(board,0,i,8,i)) return false;
        }
        for(int i=0;i<3;i++){
            for(int j=0; j<3; j++){
                if(!isPartiallyValid(board,i*3,j*3,i*3+2,j*3+2)) return false;
            }
        }
        return true;
    }
    public boolean isPartiallyValid(char[][] board, int x1, int y1, int x2, int y2){
        HashSet set = new HashSet();
        for(int i=x1; i<=x2; i++){
            for(int j=y1; j<=y2; j++){
                if(board[i][j] != '.')
                    if(!set.add(board[i][j]))
                        return false;
            }
        }
        return true;
    }
}
