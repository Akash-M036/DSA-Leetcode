public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        for (int i=0; i<isConnected.length;i++) {
            if (isConnected[i][i] == 1) {
                provinces++;
                dfs(isConnected, i);
            }
        }
        return provinces;
    }
    private void dfs(int[][] isConnected, int city) {
        isConnected[city][city] = 0;
        for (int neighbor = 0; neighbor < isConnected.length; neighbor++) {
            if (isConnected[city][neighbor] == 1 && isConnected[neighbor][neighbor] == 1) {
                dfs(isConnected, neighbor);
            }
        }
    }
}
