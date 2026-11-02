class Solution {
    public int minMoves2(int[] nums) {
       int med =0;
       Arrays.sort(nums);
       if(nums.length%2!=0)
       med= nums[nums.length/2];
       else{
            med =(nums[nums.length/2-1]+nums[nums.length/2])/2;
       }
        int ans =0;
        for(int a : nums){
            ans+=Math.abs(med-a);
        }
        return ans;
    }
}