class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1)return 0;
        int[][] dp=new int[m][n+1];
        dp[m-1][n-1]=1;
        for(int row=m-1;row>=0;row--){
            for(int col=n-1;col>=0;col--){
                if(obstacleGrid[row][col]==1){
                    dp[row][col]=0;
                    continue;
                }
                if(row==m-1 && col==n-1)continue;
                int right=0,left=0;
                if(col+1 < n)right=dp[row][col+1];
                if(row+1 < m)left=dp[row+1][col];
                dp[row][col]=right+left;
            }
        }
        return dp[0][0];
    }
}