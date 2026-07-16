class Solution {
    public int help(int[][] grid,int row,int col,int[][] dp){
        int m=grid.length;
        int n=grid[0].length;
        if(row>=m || col>=n)return Integer.MAX_VALUE;
        if(row==m-1 && col==n-1)return grid[row][col];
        if(dp[row][col]!=-1)return dp[row][col];
        int r=help(grid,row,col+1,dp);
        int d=help(grid,row+1,col,dp);
        return dp[row][col] = grid[row][col] + Math.min(r,d);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return help(grid,0,0,dp);
    }
}