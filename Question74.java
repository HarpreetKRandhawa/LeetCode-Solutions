//Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) 
            return false;
        int flag = 0;
        for(int i=0;i<matrix.length;i++){
            int l = matrix[i].length;
            if(target<=matrix[i][l-1]){
                for(int j = 0; j<l; j++){
                    if(target == matrix[i][j]){
                        flag = 1;
                        return true;
                    }
                    else{
                        flag =0;
                    }
                }
                if(flag == 0){
                    return false;
                }
            }
        }
        return false;
    }
}
