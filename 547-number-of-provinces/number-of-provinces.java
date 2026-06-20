class Solution {
    public void dfs(int node,boolean[] visited,int[][] isConnected){
        visited[node]=true;
        for(int next=0;next<isConnected.length;next++){
            if(!visited[next] && isConnected[node][next]==1){
                dfs(next,visited,isConnected);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int provinces=0;
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,visited,isConnected);
                provinces++;
            }
        }
        return provinces;
    }
}