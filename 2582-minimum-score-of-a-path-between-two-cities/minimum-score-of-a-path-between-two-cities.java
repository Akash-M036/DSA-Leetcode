import java.util.ArrayList;
import java.util.List;

public class Solution {
    static class Edge {
        int target;
        int distance;
        Edge(int target, int distance) {
            this.target = target;
            this.distance = distance;
        }
    }

    private int minScore = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {
        List<Edge>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int dist = road[2];
            graph[u].add(new Edge(v, dist));
            graph[v].add(new Edge(u, dist));
        }

        boolean[] visited = new boolean[n + 1];
        dfs(1, graph, visited);

        return minScore;
    }

    private void dfs(int node, List<Edge>[] graph, boolean[] visited) {
        visited[node] = true;

        for (Edge edge : graph[node]) {
            minScore = Math.min(minScore, edge.distance);
            if (!visited[edge.target]) {
                dfs(edge.target, graph, visited);
            }
        }
    }
}
