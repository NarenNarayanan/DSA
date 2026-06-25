class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        int n=graph.length;
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<>();
            adj.add(list);
        }
        for(int i=0;i<n;i++){
            for(int j: graph[i]){
                adj.get(j).add(i);
            }
            indegree[i] = graph[i].length;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0)q.offer(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(int u : adj.get(node)){
                indegree[u]--;
                if(indegree[u]==0)q.offer(u);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}