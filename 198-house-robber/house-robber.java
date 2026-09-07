class Solution {
    public int money(int i , int[] nums,int[] dp){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1)
            return dp[i];
        int take = Integer.MIN_VALUE;
        int k =i+2;
        take= nums[i]+ money(k,nums,dp);
        //    // if(x!=Integer.MIN_VALUE)
        //       take = Math.max(take,nums[i]+x);
        // }
        int dont = money(i+1,nums,dp);
        return dp[i]= Math.max(take,dont);
    }
    public int rob(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
            int[] dp = new int[nums.length];
            Arrays.fill(dp,-1);
        // int x =0;
        // int y =0;
        // for(int i =0; i< nums.length;i++){
        //     if(i%2==0)
        //         x+=nums[i];
        //     else
        //         y+=nums[i];
        // }
        // return Math.max(x,y);
        return money(0,nums,dp);
    }
}