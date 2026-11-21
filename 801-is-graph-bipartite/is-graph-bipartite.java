class Solution {
    public boolean divide(int i ,ArrayList<ArrayList<Integer>> adj ,int c, int[] color ){
        if(color[i]!=0 && c==color[i]) return false;
        if(color[i]!=0) return true;
        color[i] = c==1?2:1;
        boolean ans= true;
        for(int nei : adj.get(i)){
            ans = ans && divide(nei,adj,color[i],color);
        }
        return ans;
    }
    public boolean isBipartite(int[][] graph) {
        // System.out.println(graph.length);
        // System.out.print(graph[1].length);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       for(int i = 0; i < graph.length; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].length; j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        int[] color = new int[graph.length];
        // for(int i =0; i< graph.length;i++){
        //     int u = (graph[i][0]);
        //     int v = (graph[i][1]);
        //     adj.get(u).add(v);
        //     adj.get(v).add(u);
        // }
        boolean check = true;
        for(int i =0; i< graph.length;i++){
            if(color[i]==0)
                check = check && divide(i,adj,1,color);
        }
        return check;
    }
}