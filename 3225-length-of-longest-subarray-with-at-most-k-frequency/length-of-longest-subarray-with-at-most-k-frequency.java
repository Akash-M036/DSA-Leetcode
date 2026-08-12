class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l =0;
        int len =0;
        for(int r=0; r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(map.getOrDefault(nums[r],0)>k){
                while(map.getOrDefault(nums[r],0)>k){
                    map.put(nums[l],map.get(nums[l])-1);
                    l++;
                }
            }
            len = Math.max(r-l+1,len);
        }
        return len;
    }
}