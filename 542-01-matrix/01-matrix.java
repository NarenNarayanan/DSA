class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] dis=new int[m][n];
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    queue.add(new int[] {i,j});
                }
                else{
                    dis[i][j]=-1;
                }
            }
        }
        int [] dx={0,0,1,-1};
        int [] dy={1,-1,0,0};
        while(!queue.isEmpty()){
            int[] arr=queue.poll();
            int x=arr[0] , y=arr[1];
            for(int d=0;d<4;d++){
                int nx=x + dx[d] , ny= y+ dy[d];
                if(nx>=0 && nx<m && ny>=0 && ny<n &&dis[nx][ny]==-1){
                    dis[nx][ny]=dis[x][y]+1;
                    queue.offer(new int[] {nx,ny});
                }
            }
        }
        return dis;
    }
}