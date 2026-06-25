class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        int count=0;
        int iter=0;
        int[] ans=new int[n];
        List<List<Integer>> adj=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<>();
            adj.add(list);
        }
        for(int[] edge : prerequisites){
            int course=edge[0];
            int pre=edge[1];
            indegree[course]++;
            adj.get(pre).add(course);
        }
        for(int i=0;i<n;i++){
            if(indegree[i]==0)q.offer(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            for(int i : adj.get(node)){
                indegree[i]--;
                if(indegree[i]==0)q.offer(i);
            }
            count++;
            ans[iter++]=node;
        }
        return count==n ? ans : new int[0];
    }
}