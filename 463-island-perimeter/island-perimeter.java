class Solution {
    public int dfs(int row,int col,int[][] grid){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length)return 1;
        if(grid[row][col]==0)return 1;
        if(grid[row][col]==-1)return 0;
        grid[row][col]=-1;
        int perimeter=0;
        perimeter+=dfs(row+1,col,grid);
        perimeter+=dfs(row-1,col,grid);
        perimeter+=dfs(row,col+1,grid);
        perimeter+=dfs(row,col-1,grid);
        return perimeter;
    }
    public int islandPerimeter(int[][] grid) {
        int m=grid.length , n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return dfs(i,j,grid);
                }
            }
        }
        return 0;
    }
}