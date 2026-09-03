class Solution {
    public int jumps(int i , int[] nums,int[] dp){
        if(i==nums.length-1)
            return 0;
        if(i>nums.length-1)
            return Integer.MAX_VALUE;
        if(dp[i]!=-1)
            return dp[i];
        int ans = Integer.MAX_VALUE;
        for(int k =1; k<=nums[i];k++){
            int x = jumps(i+k,nums,dp);
            if(x != Integer.MAX_VALUE)
                ans = Math.min(ans,1+x);
        }
        return dp[i]=ans;
    }
    public int jump(int[] nums) {
        if(nums[0]==0) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
       return jumps(0,nums,dp);
    }
}