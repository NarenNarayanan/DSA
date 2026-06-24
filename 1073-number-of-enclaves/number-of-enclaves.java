class Solution {
    int count=0;
    public void dfsCount(int row,int col,int[][] grid){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length)return;
        if(grid[row][col]==1){
            grid[row][col]=0;
            count++;
            dfsCount(row+1,col,grid);
            dfsCount(row-1,col,grid);
            dfsCount(row,col+1,grid);
            dfsCount(row,col-1,grid);
        }
        else return;
    }
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==m-1 || j==n-1){
                    dfs(i,j,grid);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    dfsCount(i,j,grid);
                }
            }
        }
        return count;
    }
    public void dfs(int row,int col,int[][] grid){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length)return;
        if(grid[row][col]==1){
            grid[row][col]=0;
            dfs(row+1,col,grid);
            dfs(row-1,col,grid);
            dfs(row,col+1,grid);
            dfs(row,col-1,grid);
        }
        else return;
    }
}