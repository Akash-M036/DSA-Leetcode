class Solution {
    public int maxSubArray(int[] nums) {
        int curr=  nums[0];
        int maxs= nums[0];
        for(int i = 1; i<nums.length; i++){
            curr = Math.max(curr+nums[i],nums[i]);
            maxs = Math.max(maxs,curr);
        }
        return maxs;
    }
}