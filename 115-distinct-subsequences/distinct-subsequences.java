class Solution {
    public int dis(int i , int j, String s, String t,int[][] dp)
    {
        if(j==t.length())
            return 1;
        if(i>=s.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
         int match =0;
        if(s.charAt(i)==t.charAt(j))
          match = dis(i+1,j+1,s,t,dp);
        int didnt = dis(i+1,j,s,t,dp);
        return dp[i][j]= match+didnt;
    }
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return dis(0,0,s,t,dp);
    }
}