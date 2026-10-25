class Solution {
    int[] dirx = {1,0,-1,0};
    int[] diry = {0,1,0,-1};
    public int closedIsland(int[][] grid) {
        int ans =0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        Queue<int[]> q = new LinkedList<>();
        for(int i =0; i<grid.length;i++){
            for(int j =0; j< grid[0].length;j++){
                if(grid[i][j]==0 && !vis[i][j]){
                    q.offer(new int[]{i,j});
                    vis[i][j]=true;
                    boolean close = true;
                    while(!q.isEmpty()){
                        int[] loc = q.poll();
                        int ni =loc[0];
                        int nj = loc[1];
                        if(ni==0 || nj==0 || ni==grid.length-1 || nj==grid[0].length-1){
                            close = false;
                        }
                        for(int d =0;d<4;d++){
                            int newi=ni+dirx[d];
                            int newj= nj+diry[d];
                            if(newi<0 || newj<0 || newi>=grid.length || newj>=grid[0].length ){ 
                                continue;
                            }
                            if(!vis[newi][newj] && grid[newi][newj]==0){
                                vis[newi][newj]=true;
                                q.offer(new int[]{newi,newj});
                            }
                        }
                    }
                    if(close) ans++;
                }
            }
         }
         return ans;
    }
}
