class Solution {
    public int minMoves(int[] nums) {
        int max=-1;
        for(int a:nums){
            max= Math.max(max,a);
        }
        int ans =0;
        for(int a : nums){
            ans +=Math.abs(a-max);
        }
        return ans;
    }
}