class Solution {
    private final int MOD = 1000000007;
    public int move(int i, int j,int dir, int[][] grid, int[][] dp) {
        if(i>=grid.length || j>=grid[0].length)
            return 0;
        if(grid[i][j]==1){
            if(dir==1)
                return move(i+1,j,2,grid,dp);
            else if(dir==2)
                return move(i,j+1,1,grid,dp);
        }
        if(i==grid.length-1 && j==grid[0].length-1)
            return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int r = move(i,j+1,1,grid,dp);
        int d = move(i+1,j,2,grid,dp);
        return dp[i][j] = (r+d)%MOD;
    }
    public int uniquePaths(int[][] grid) {
        int[][] dp = new int[ grid.length+1 ][grid[0].length+1];
        for(int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        return  move(0,0,0,grid,dp);
    }
}