class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,n=mat.length;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        for(int i=0;i<mat.length;i++){
            sum+=mat[n-i-1][i];
        }
        if(n%2!=0)sum=sum-mat[n/2][n/2];
        return sum;
    }
}