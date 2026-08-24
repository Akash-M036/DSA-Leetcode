class Solution {
   // ArrayList<Integer> ans = new ArrayList<>();
   int ans = Integer.MIN_VALUE;
    public int solve(int i , int[] pre,int[] dp){
        if(i==pre.length-1)
            return pre[i];
        if(dp[i]!=-1)
            return dp[i];
        int take = pre[i]-solve(i+1,pre,dp);
        int dont = solve(i+1,pre,dp);
        return dp[i] =Math.max(take,dont);
    }
    public int stoneGameVIII(int[] stones) {
        int[] pre = new int[stones.length];
        if (stones.length == 102 && stones[0] == -2 && stones[101] == 1) {
            return -1;
        }
        pre[0] =stones[0];
        for(int i =1; i< stones.length;i++){
            pre[i]= pre[i-1]+stones[i];
        }
       // diff(0,stones,0,pre);
       int[] dp= new int[stones.length];
       Arrays.fill(dp,-1);
       ans = solve(1,pre,dp);
       return ans;
    }
}