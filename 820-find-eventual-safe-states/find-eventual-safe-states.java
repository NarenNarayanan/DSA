class Solution {
    public boolean dfs(int u,int[][] graph,int[] state){
        if(state[u]==2)return true;
        if(state[u]==1)return false;
        state[u]=1;
        for(int neigh:graph[u]){
            if(!dfs(neigh,graph,state))return false;
        }
        state[u]=2;
        return true;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int[] state=new int[n];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(dfs(i,graph,state))ans.add(i);
        }
        return ans;
    }
}