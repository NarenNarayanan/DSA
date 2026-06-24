class Solution {
    public int dfs(int row,int col,int[][] grid,int[][] visited){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length)return 1;
        if(visited[row][col]==-1)return 1;
        if(visited[row][col]==1)return 0;
        visited[row][col]=1;
        int perimeter=0;
        perimeter+=dfs(row+1,col,grid,visited);
        perimeter+=dfs(row-1,col,grid,visited);
        perimeter+=dfs(row,col+1,grid,visited);
        perimeter+=dfs(row,col-1,grid,visited);
        return perimeter;
    }
    public int islandPerimeter(int[][] grid) {
        int m=grid.length , n=grid[0].length;
        int[][] visited=new int[m][n];
        int i,j,x=0,y=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]==1){x=i;y=j;}
                if(grid[i][j]==0)visited[i][j]=-1;
            }
        }
        return dfs(x,y,grid,visited);
    }
}