class Solution { 
    public int range(int k, int M, int[] pre, int[] piles, int[][] dp, boolean chance) { 
        if (k >= piles.length) return 0; 
        
        if (!chance && dp[k][M] != -1) return dp[k][M]; 
        
        int ans1 = 0; 
        int ans2 = Integer.MAX_VALUE; 
        
        for (int i = 1; i <= 2 * M; i++) { 
            if (!chance) { 
                int val = (k + i < piles.length ? pre[k + i - 1] : pre[piles.length - 1]) - (k > 0 ? pre[k - 1] : 0) 
                        + range(k + i, Math.max(M, i), pre, piles, dp, !chance); 
                ans1 = Math.max(ans1, val); 
            } else { 
                int val = range(k + i, Math.max(M, i), pre, piles, dp, !chance); 
                ans2 = Math.min(ans2, val); 
            } 
        } 
        
        if (!chance) {
            return dp[k][M] = ans1;
        } else {
            return ans2;
        }
    } 

    public int stoneGameII(int[] piles) { 
        int n = piles.length;
        int[] pre = new int[n]; 
        pre[0] = piles[0]; 
        for (int i = 1; i < n; i++) { 
            pre[i] = pre[i - 1] + piles[i]; 
        } 
        
        int[][] dp = new int[n][n + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        
        return range(0, 1, pre, piles, dp, false); 
    } 
}
