class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] premax = new int[nums.length];
        int[] suffmin = new int[nums.length];
        premax[0]=nums[0];
        suffmin[nums.length-1]=nums[nums.length-1];
        for(int i =1; i<nums.length;i++){
            premax[i]= Math.max(premax[i-1],nums[i]);
        }
        for(int i = nums.length-2; i>=0; i--){
            suffmin[i]= Math.min(suffmin[i+1],nums[i]);
        }
        long ans  = (long)1e15;
        int idx=-1;
         for(int i = 0; i<nums.length;i++){
            int x = premax[i] - suffmin[i];
            //((i<=nums.length-2)?suffmin[i+1]:0);
            if(x<=k){
                if(ans>x){
                    ans =x;
                  return i;
                }
            }
        }
        if(ans !=(long)1e15)
            return idx;
        return -1;

    }
}