class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=numCourses;
        int[] indegree=new int[n];
        Queue<Integer> q=new LinkedList<>();
        int count=0;
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
        }
        return count==n;
    }
}