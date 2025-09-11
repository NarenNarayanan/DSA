class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean isFirstColZero=false;
        for(int row=0;row<m;row++){
            if(matrix[row][0]==0)isFirstColZero=true;
            for(int col=1;col<n;col++){
                if(matrix[row][col]==0){
                    matrix[row][0]=0;
                    matrix[0][col]=0;
                }
            }
        }
        for(int row=m-1;row>=0;row--){
            for(int col=n-1;col>=1;col--){
                if(matrix[row][0]==0||matrix[0][col]==0){
                    matrix[row][col]=0;
                }
            }
            if(isFirstColZero){
                    matrix[row][0]=0;
            }
        }
    }
}