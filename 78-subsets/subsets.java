class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void subsets(int idx, List<Integer> in,int[] nums){
        if(idx == nums.length){
            ans.add(in);
            return;
        }
        List<Integer> temp  = new ArrayList<>(in);
        temp.add(nums[idx]);
        subsets(idx+1,temp,nums);
        subsets(idx+1,in,nums);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> val  = new ArrayList<>();
        subsets(0,val,nums);
        return ans;
    }
}