class Solution {
    public int maxProfit(int[] prices) {
        int[] suffixmax = new int[prices.length];
        suffixmax[ prices.length-1] =prices[ prices.length-1];
        for(int i = prices.length-2; i>=0;i--){
            suffixmax[i] = Math.max(suffixmax[i+1],prices[i]);
        }
        int ans  = 0;
        for(int i =0; i <  prices.length ; i++){
            ans = Math.max(ans, suffixmax[i]-prices[i]);
        }
        return ans;
    }
}