class Solution {
    public int numIslands(char[][] grid) {
        int rowLength=grid.length;
        int colLength=grid[0].length;
        int cnt=0;
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    dfs(grid,i,j);
                }
            }
        }
        return cnt;
    }
    public void dfs(char[][] grid,int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length)return;
        if (grid[row][col] == '0') return;
        grid[row][col]='0';
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
    }
}