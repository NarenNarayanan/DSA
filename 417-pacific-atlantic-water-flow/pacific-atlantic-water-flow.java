class Solution {
    public void dfs(int row,int col,int[][] heights,int[][] ocean){
        if(ocean[row][col]==1)return;
        ocean[row][col]=1;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        for(int i=0;i<4;i++){
            int nx=row+dx[i];
            int ny=col+dy[i];
            if (nx < 0 || ny < 0 || nx >= heights.length || ny >= heights[0].length){
                continue;
            }
            if(heights[nx][ny] >= heights[row][col]){
                dfs(nx,ny,heights,ocean);
            }
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length , n=heights[0].length;
        int[][] pacific=new int[m][n];
        int[][] atlantic=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    dfs(i,j,heights,pacific);
                }
            }
        }
        //atlantic
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==m-1 || j==n-1){
                    dfs(i,j,heights,atlantic);
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j]==1 && atlantic[i][j]==1){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}