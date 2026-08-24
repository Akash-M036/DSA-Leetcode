class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        if(nums.length< 2*k+1)
         return ans;
        long[] pre = new long[nums.length];
        pre[0]=nums[0];
        for(int i =1; i< nums.length;i++){
            pre[i] = pre[i-1]+nums[i];
        }

        for(int i =k ; i<= nums.length-k;i++){
            long val = i+k<nums.length ?pre[i+k]:-1;
            long val2 = i-k-1>=0?pre[i-k-1]:0;
            if(val!=-1){
                long addval = (val-val2)/(2*k+1);
                ans[i]=(int)addval;
            }
        }
        return ans;
    }
}