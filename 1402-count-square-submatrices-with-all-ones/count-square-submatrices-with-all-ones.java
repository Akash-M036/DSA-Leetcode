class Solution {
    int ans = 0;
    public int sq(int i , int j, int[][] matrix,int[][] dp){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length || matrix[i][j]==0)
            return 0;
            if(dp[i][j]!=-1) return dp[i][j];
        int r = sq(i+1,j,matrix,dp);
        int l = sq(i,j+1,matrix,dp);
        int d = sq(i+1,j+1,matrix,dp);
        int x = Math.min(r,Math.min(l,d));
        //if(r>=1 && l>=1 && d>=1)
         return dp[i][j] = 1+x;
    }
    public int countSquares(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int[] r : dp)
            Arrays.fill(r,-1);
      for(int i =0; i< matrix.length;i++){
        for(int j =0; j< matrix[0].length;j++){
           // if(dp[i][j]==-1){
                ans += sq(i,j,matrix,dp);
            //     n = n*(n+1)*(2*n+1);
            //     n=n/6;
            //     ans +=(int)n;
            // }
            // if(dp[i][j]==1) ans++;
        }
      }
      return ans;
    }
}