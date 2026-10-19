class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int cnt=0;
        int ctar =0;
        for(int i =0; i< nums.length;i++){
            if(nums[i]==target)
                ctar++;
            if(nums[i]<target){
                cnt++;
            }
        }
        while(ctar!=0){
            ans.add(cnt);
            cnt++;
            ctar--;
        }
        return ans;
    }
}