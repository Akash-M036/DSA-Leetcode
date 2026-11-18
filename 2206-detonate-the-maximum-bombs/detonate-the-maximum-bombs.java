class Solution {
    public double dist(int i , int j, int x, int y){
        return Math.pow(Math.pow((long)i-x,2)+Math.pow((long)j-y,2),0.5);
    }
    public int dfs(int idx, ArrayList<ArrayList<Integer>> adj ,boolean[] vis){
        if(vis[idx]) return 0;
        vis[idx]=true;
        int ans =1;
        for(int nei : adj.get(idx)){
            ans+=dfs(nei,adj,vis);
        }
          //  vis[idx]=false;
        return ans;
    }
    public int maximumDetonation(int[][] bombs) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i< bombs.length;i++) adj.add(new ArrayList<>());
        for(int i=0; i<bombs.length;i++){
            int x1 = bombs[i][0];
            int y1 = bombs[i][1];
            int r1 = bombs[i][2];
            for(int j=i+1;j<bombs.length;j++){
                int x2 = bombs[j][0];
                int y2 = bombs[j][1];
                int r2 = bombs[j][2];
                double distbtwn = dist(x1,y1,x2,y2);
                if(distbtwn<=r1)
                    adj.get(i).add(j);
                if(distbtwn<=r2)
                    adj.get(j).add(i);
            }
        }
        System.out.println(adj);
        boolean[] vis = new boolean[bombs.length];
        int ans = 0;
        for(int i =0; i< bombs.length;i++){
            vis = new boolean[bombs.length];
            ans= Math.max(ans,dfs(i,adj,vis));
        }
        return ans;
    }
}