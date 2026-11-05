class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int[] indeg = new int[quiet.length];
        int[] ans = new int[quiet.length];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i< quiet.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0;i<richer.length;i++){
            int u =richer[i][1];
            int v = richer[i][0];
            indeg[u]++;
            adj.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<quiet.length;i++){
            if(indeg[i]==0) q.add(i);
            ans[i]=i;
        }
        while(!q.isEmpty()){
            int u = q.poll();
            for(int nei : adj.get(u)){
                if(quiet[u]<quiet[nei]){
                    quiet[nei]=quiet[u];
                    ans[nei]=ans[u];
                }
                indeg[nei]--;
                if(indeg[nei]==0) q.add(nei);
            }
        }
        return ans;
    }
}