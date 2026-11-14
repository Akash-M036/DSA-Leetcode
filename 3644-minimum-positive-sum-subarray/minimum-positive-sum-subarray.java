class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       int[] prefix = new int[nums.size()];
       prefix[0]= nums.get(0);
        for(int i =1; i< nums.size();i++){
            prefix[i]=prefix[i-1]+nums.get(i);
        }
        int ans =Integer.MAX_VALUE;
        for(int i =0; i< nums.size();i++){
            for(int j =i; j<nums.size();j++){
                if(j-i+1>=l && j-i+1 <=r){
                    int x = i-1>=0?prefix[i-1]:0;
                    int val = prefix[j]-x;
                    if(val>0)
                        ans = Math.min(ans, val);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}