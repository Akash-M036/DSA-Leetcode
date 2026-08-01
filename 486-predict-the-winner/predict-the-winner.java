class Solution {
    boolean ans =true;
    long total =0;
    public long winner(int i,int j,int[] nums,long[][] dp){
        if(i>j || i>= nums.length  || j>= nums.length || i<0 || j<0)
            return 0;
        if(i==j){
            return nums[i];
        }
         if (i + 1 == j) {
            return Math.max(nums[i], nums[j]);
        }
        if(dp[i][j]!=-1)
            return dp[i][j];

        long p1 = nums[i]+ Math.min(winner(i+ 2, j, nums,dp), winner(i+1,j-1,nums,dp));
        long p2 = nums[j]+Math.min(winner(i,j-2,nums,dp),winner(i+1,j-1,nums,dp));
    return dp[i][j] = Math.max(p1,p2);
    }
    public void totalval(int i,int[] nums){
        if(i> nums.length-1){
            return;
        }
        total = total + nums[i];
        totalval(i+1,nums);
        return ;
    }
    public boolean predictTheWinner(int[] nums) {
        long[][] dp = new long[nums.length][nums.length];
        totalval(0,nums);
        for(long[] rows : dp){
            Arrays.fill(rows,-1);
        }
        long person1 = winner(0,nums.length-1,nums,dp);
        long person2 = total -person1;
        return person1>=person2;
    }
}