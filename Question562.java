class Solution {
    public int longestLine(int[][] M) {
        if(M.length == 0 || M[0].length == 0)
            return 0;
        int max = 0;
        
        int[] col = new int[M[0].length];
        int[] diag = new int[M[0].length + M.length];
        int[] antidiag = new int[M[0].length + M.length];
        
        for(int i=0; i<M.length; i++){
            int row = 0;
            for(int j=0; j<M[0].length; j++){
                if(M[i][j] == 1){
                    row++;
                    col[j]++;
                    diag[j+i]++;
                    antidiag[j-i+M.length]++;
                    max = Math.max(max,row);
                    max = Math.max(max,col[j]);
                    max = Math.max(max,diag[j+i]);
                    max = Math.max(max,antidiag[j-i+M.length]);
                }
                else{
                    row = 0;
                    col[j] = 0;
                    diag[j+i] = 0;
                    antidiag[j-i+M.length] = 0;
                }
            }
        }
        return max;
    }
}
