class Solution {
  //  int ans= Integer.MAX_VALUE;
  int[][] dp ;
    public int seq(int i, int target, List<Integer> nums){
        if(target<0)
            return Integer.MIN_VALUE/2;
        if(target==0)
            return 0;
        if(i>=nums.size())
            return Integer.MIN_VALUE/2;
        if(dp[i][target]!=-1) return dp[i][target];
        int take =  Integer.MIN_VALUE/2;
        int dont = Integer.MIN_VALUE/2;
        int x = seq(i+1,target-nums.get(i),nums);
        if(x!= Integer.MIN_VALUE/2)
            take = 1+x;
        dont = seq(i+1,target,nums);
        //ans = Math.min(ans,Math.min(take,dont));
        return dp[i][target] = Math.max(take,dont);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        dp = new int[nums.size()+1][target+1];
        for(int[] row: dp)
            Arrays.fill(row,-1);
        seq(0,target,nums);
        int ans =Integer.MIN_VALUE;
        for(int i =0;i< nums.size();i++){
            if(dp[i][target]!=-1) {
                ans = Math.max(ans,dp[i][target]);
                System.out.println(dp[i][target]);
            }
        }
        return ans==Integer.MIN_VALUE/2?-1:ans;
    }
}