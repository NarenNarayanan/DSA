class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n+1];
        dp[m-1][n-1]=1;
        for(int row=m-1;row>=0;row--){
            for(int col=n-1;col>=0;col--){
                if(row==m-1 && col==n-1)continue;
                int right = 0;
                int down = 0;
                if(col+1 < n)
                    right = dp[row][col+1];
                if(row+1 < m)
                    down = dp[row+1][col];
                dp[row][col] = right + down;
            }
        }
        return dp[0][0];
    }
}