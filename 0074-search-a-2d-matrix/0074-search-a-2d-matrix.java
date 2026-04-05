class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i,j = 0;
        int m = matrix.length;
        int n = matrix[0].length;    
            for (i =0;i<m;i++){
                for(j = 0;j<n;j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
            }

        return false;
    }
}
