class Solution {
    public int uniqueXorTriplets(int[] nums) {
        
        int maxm = -1;
        for(int i =0; i<nums.length;i++){
            maxm= Math.max(nums[i],maxm);
        }
        if(maxm == 1)
            return 1;
        if(maxm == 2)
            return 2;
        int cnt = 0;
        while(maxm!=0){
            maxm=maxm/2;
            cnt++;
        }
        return (int)Math.pow(2,cnt);
    }
}