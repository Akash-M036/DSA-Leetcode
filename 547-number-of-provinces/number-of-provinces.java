public class Solution {
    public void dfs(int idx ,  ArrayList<ArrayList<Integer>> adj ,boolean[] vis){
        if(vis[idx]) return;
        vis[idx]=true;
        for(int nei : adj.get(idx)){
            dfs(nei,adj,vis);
        }
        return;
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<isConnected.length+1;i++){
            adj.add(new ArrayList<>());
        }
        boolean[] vis = new boolean[isConnected.length+1];
        for(int i =0; i<isConnected.length;i++){
            for(int j =0;j<i;j++){
                if(isConnected[i][j]==1){
                    adj.get(i+1).add(j+1);
                    adj.get(j+1).add(i+1);
                }
            }
        }
        int cnt=0;
        for(int i =1; i<isConnected.length+1;i++){
            if(!vis[i]){
                cnt++;
                dfs(i,adj,vis);
            }
        }
        return cnt;
    }
}
