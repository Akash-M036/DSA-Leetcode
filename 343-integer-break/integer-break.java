class Solution {
   // boolean st = true;
    int a;
    public int reoccur(int n){
        //if(n==2) return 1;
        if(n==0 || n==1) return 1;
        if(n<0) return Integer.MIN_VALUE;
        if(dp[n]!=-1) return dp[n];
       // System.out.println(n);
        int ans = Integer.MIN_VALUE;
        for(int i =1; i<=n;i++){
            if(a==n && i==n) continue; 
            int x = reoccur(n-i);
            if(x!=Integer.MIN_VALUE)
                ans = Math.max(ans,i*x);
        }
        //System.out.println(ans);
        return dp[n] = ans;
    }
    int[] dp;
    public int integerBreak(int n) {
        a=n;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return reoccur(n);
    }
}