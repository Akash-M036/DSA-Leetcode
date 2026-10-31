class Solution {
    private final int MOD = 1000000007;
    public int move(int i, int j,int dir, int[][] grid, int[][][] dp) {
        if(i>=grid.length || j>=grid[0].length)
            return 0;
        if(i==grid.length-1 && j==grid[0].length-1)
            return 1;
        if(dp[i][j][dir-1]!=-1) return dp[i][j][dir-1];
        int r = move(i,j+1,1,grid,dp);
        int d = move(i+1,j,2,grid,dp);
        if(grid[i][j]==1){
            if(dir==1)
                return dp[i][j][dir-1]=d;
            else if(dir==2)
                return dp[i][j][dir-1]=r;
        }
        return dp[i][j][dir-1] = (r+d)%MOD;
    }
    public int uniquePaths(int[][] grid) {
        int[][][] dp = new int[ grid.length+1 ][grid[0].length+1][2];
        for(int[][] rows : dp){
            for(int[] row : rows)
            Arrays.fill(row,-1);
        }
        return  move(0,0,1,grid,dp);
    }
}