class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int maxval =-1;
        int minval = 200;
        for(int a : nums){
            map.put(a,1);
            maxval = Math.max(maxval,a);
            minval = Math.min(minval,a);
        }
        for(int i = minval; i<=maxval;i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}