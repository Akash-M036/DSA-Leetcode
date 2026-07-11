
class Solution {
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int[] ve) {
        if (vis[node])
            return;

        vis[node] = true;
        ve[0]++;
        ve[1] += adj.get(node).size();

        for (int neighbour : adj.get(node)) {
            if (!vis[neighbour]) {
                dfs(neighbour, adj, vis, ve);
            }
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] vis = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                int[] ve = new int[2];
                dfs(i, adj, vis, ve);

                int v = ve[0];
                int e = ve[1];

                if (e == v * (v - 1)) {
                    count++;
                }
            }
        }
        return count;
    }
}
