class Solution {

    public void dfs(int node, int[][] isConnected, boolean[] visited) {

        visited[node] = true;

        for (int next = 0; next < isConnected.length; next++) {

            if (isConnected[node][next] == 1 && !visited[next]) {
                dfs(next, isConnected, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        boolean[] visited = new boolean[n];

        int provinces = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                dfs(i, isConnected, visited);

                provinces++;
            }
        }

        return provinces;
    }
}