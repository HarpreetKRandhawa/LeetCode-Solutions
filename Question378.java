class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int len = matrix.length*matrix.length;
        int[] oneDArray = new int[len];
        int z=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                oneDArray[z++] = matrix[i][j];
            }
        }
        Arrays.sort(oneDArray);
        return oneDArray[k-1];
    }
}
