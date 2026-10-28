class Solution {
    public int ans =Integer.MAX_VALUE;
    public int cost(int i , int j ,int val, int[][] grid,int[][][] dp){
        if(i==grid.length-1 && j==grid[0].length-1){
          // 
            return dp[i][j][val]= val^grid[i][j];
        }
        if(i>grid.length-1 || j>grid[0].length-1 )
            return Integer.MAX_VALUE;
        if(dp[i][j][val]!=-1) return dp[i][j][val];
        int l =val;
        val^=grid[i][j];
       // System.out.println(i+" "+ j);
        int x = cost(i+1,j,val,grid,dp);
        int y = cost(i,j+1,val,grid,dp);
        return dp[i][j][l] = Math.min(x,y);
    }
    public int minCost(int[][] grid) {
        int[][][] dp =new int[grid.length+1][grid[0].length+1][1024];
        for(int[][] r: dp){
            for(int[] c :r){
                Arrays.fill(c,-1);
            }
        }
        cost(0,0,0,grid,dp);
        return dp[0][0][0];
    }
}