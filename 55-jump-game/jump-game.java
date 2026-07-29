class Solution {
    public boolean canJump(int[] nums) {
        int  r = 0;
        for(int i =0; i< nums.length;i++){
            if(nums[i]==0 && r==i)
            break;
            r = Math.max(nums[i]+i,r);
        }
        return r>=nums.length-1 ? true : false;

    }
}