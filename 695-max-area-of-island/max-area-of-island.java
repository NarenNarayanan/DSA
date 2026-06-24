class Solution {
public int dfs(int row, int col, int[][] grid){
    if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length)
        return 0;
    if(grid[row][col] == 0)
        return 0;
    grid[row][col] = 0;
    int area = 1;
    area += dfs(row + 1, col, grid);
    area += dfs(row - 1, col, grid);
    area += dfs(row, col + 1, grid);
    area += dfs(row, col - 1, grid);
    return area;
}
    public int maxAreaOfIsland(int[][] grid) {
        int max=0,sum=0;
        int m=grid.length , n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    sum=dfs(i,j,grid);
                    max=Math.max(max,sum);
                }
            }
        }
        return max;
    }
}