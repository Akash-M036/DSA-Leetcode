class Solution {
    int ans =0;
    public int countServers(int[][] grid) {
      //  boolean[] vis = new boolean[]
       for(int i =0; i< grid.length;i++){
            int x=0;
        for(int j =0; j<grid[0].length;j++)
        {
            if(grid[i][j]==1){
                x++;
                //grid[i][j]=2;
            }
        }
        if(x>1) {
            ans+=x;
        for(int j =0; j<grid[0].length;j++)
        {
            if(grid[i][j]==1){
               // x++;
                grid[i][j]=2;
            }
        }
        }
       }
       for(int j =0; j<grid[0].length;j++){
            int x=0;
            int cnt2=0;
        for(int i =0; i< grid.length;i++)
        {
            if(grid[i][j]==1){
                x++;
                //grid[i][j]=2;
            }
            if(grid[i][j]==2){
                cnt2++;
            }
        }
        if(x+cnt2>1) ans+=x;
       }
       return ans;
    }
}