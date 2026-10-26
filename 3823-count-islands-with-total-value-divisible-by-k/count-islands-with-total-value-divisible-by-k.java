class Solution {
    int[] dirx = {0,1,0,-1};
    int[] diry = {1,0,-1,0};
    public long dfs(int i ,int  j, int[][] grid,boolean[][] vis){
        if(i<0 | j< 0|| i>=grid.length || j>=grid[0].length || vis[i][j] || grid[i][j]==0)
            return Long.MAX_VALUE/2;
        vis[i][j]=true;
        long ans =grid[i][j];
        for(int x =0; x<4;x++){
            long y = dfs(i+dirx[x],j+diry[x],grid,vis);
            if(y!=Long.MAX_VALUE/2){
                ans+=y;
            }
        }
        //System.out.println(i+" "+j+" "+ans);
        return ans;
    }
    public int countIslands(int[][] grid, int k) {
        int cnt =0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        for(int i =0; i< grid.length;i++){
            for(int j =0; j< grid[0].length;j++){
                if(grid[i][j]==0 || vis[i][j]) continue;
                // if(grid[i][j]==9)
                // System.out.println(grid[i][j]);
                long val =dfs(i,j,grid,vis);
              //  System.out.println(val);
                if(val%k==0)
                    cnt++;
            }
        }
        return cnt;
    }
}