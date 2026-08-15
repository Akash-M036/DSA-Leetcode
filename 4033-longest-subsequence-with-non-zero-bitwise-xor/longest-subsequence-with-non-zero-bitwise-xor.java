class Solution {
    
    public int longestSubsequence(int[] nums) {
       int ans =0;
       int cnt0 =0;
       for(int num: nums){
        if(num ==0)
            cnt0++;
        ans = ans^num;
       }
       if(cnt0==nums.length)
            return 0;
       if(ans==0)
         return nums.length-1;
        return nums.length;
    }
}