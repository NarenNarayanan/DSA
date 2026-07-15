class Solution {
    public int help(int[][] mat,int row,int col,int[][] dp){
        int m=mat.length;
        int n=mat[0].length;
        if(row>=m || col>=n)return 0;
        if(row==m-1 && col==n-1)return 1;
        if(mat[row][col]==1)return 0;
        if(dp[row][col]!=-1)return dp[row][col];
        int right=help(mat,row,col+1,dp);
        int left=help(mat,row+1,col,dp);
        return dp[row][col]=right+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1)return 0;
        int[][] dp=new int[m][n+1];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return help(obstacleGrid,0,0,dp);
    }
}