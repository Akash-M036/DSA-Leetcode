class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans =0;
        for(int i =0; i< nums.length;i++){
            if(nums[i]<0)
                nums[i]=-nums[i];
            ans += 1L*nums[i]*nums[i];
        }
        Arrays.sort(nums);
        for(int i =0; i<=nums.length/2-1;i++){
            ans -= 2L*nums[i]*nums[i];
        }
        return ans;
    }
}