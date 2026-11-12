class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1) return 1;
      int lmaxinc=0;
      int lmaxdec=0;
      int i =1;
      int len=1;
      while(i<nums.length){
        if(nums[i-1]<nums[i]){
            len++;
        }
        else if(nums[i-1]>=nums[i])
            len=1;
        lmaxinc = Math.max(lmaxinc, len);
        i++;
      }
      i=1;
      len=1;
       while(i<nums.length){
        if(nums[i-1]>nums[i]){
            len++;
        }
        else if(nums[i-1]<=nums[i])
            len=1;
        lmaxdec = Math.max(lmaxdec, len);
      i++;
      }
      return Math.max(lmaxinc,lmaxdec);
    }
}