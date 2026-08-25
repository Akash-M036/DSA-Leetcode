class Solution {
    int[] dirud = {-1,0,1,0};
    int[] dirlr = {0,1,0,-1};
    public void dfs(int i,int j,char[][] grid,boolean[][] vis ){
        if(i<0 ||j<0|| j>=grid[0].length ||i>=grid.length)
            return;
        if(grid[i][j]=='0')
            return;
        if(vis[i][j])
            return;
        vis[i][j]=true;
       for(int k=0; k<4;k++){
            dfs(i+dirud[k],j+dirlr[k],grid,vis);
       }
    }
    public int numIslands(char[][] grid) {
        int ans =0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        for(int i =0; i<grid.length;i++){
            for(int j =0; j<grid[i].length;j++){
                if(grid[i][j]=='0' || vis[i][j])
                    continue;
                else
                {
                    ans++;
                    dfs(i,j,grid,vis);
                }
            }
        }
        return ans;
    }
}