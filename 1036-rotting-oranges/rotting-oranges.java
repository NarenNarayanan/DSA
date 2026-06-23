class Solution {
    public int orangesRotting(int[][] grid) {
       int days=0,count=0,total=0;
       Queue<int[]> rotten = new LinkedList<>();
       int m=grid.length;
       int n=grid[0].length;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            int x=grid[i][j];
            if(x!=0)total++;
            if(x==2)rotten.add(new int[] {i,j});
        }
       }
       int[] dx={0,0,1,-1};
       int[] dy={1,-1,0,0,};
       while(!rotten.isEmpty()){
        int size=rotten.size();
        count=count+size;
        for(int i=0;i<size;i++){
            int[] pos=rotten.poll();
            for(int d=0;d<4;d++){
                int nx=pos[0]+dx[d], ny=pos[1]+dy[d];
                if(nx>=0 && nx<m && ny>=0 && ny<n && grid[nx][ny]==1){
                    grid[nx][ny]=2;
                    rotten.add(new int[]{nx,ny});
                }
            }
        }
        if(!rotten.isEmpty())days++;
       }
       return count==total ? days : -1;
    }
}