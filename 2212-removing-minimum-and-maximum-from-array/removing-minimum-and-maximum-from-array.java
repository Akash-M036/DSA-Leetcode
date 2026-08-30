class Solution {
    public int minimumDeletions(int[] nums) {
       if(nums.length ==1) return 1;
       if(nums.length ==2 ) return 2;
       int maxval =Integer.MIN_VALUE;
        int minidx =-1;
        int minval = Integer.MAX_VALUE;
        int maxidx =-1;
        for(int i =0; i< nums.length;i++){
            if(nums[i]>maxval){
                maxval = nums[i];
                maxidx = i;
            }
            if(nums[i]<minval){
                minval = nums[i];
                minidx =i;    
            }
        }
        int left = Math.min(minidx,maxidx)+1;
        int middle = Math.max(minidx,maxidx)+1-left;
        int right = nums.length-Math.max(minidx,maxidx);
        int val1 =left+middle;
        int val2 = left+right;
        int val3 = middle+right;
        return Math.min(Math.min(val1,val2),val3);
    }
}