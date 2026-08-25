class Solution {
    public int longestBalanced(int[] nums) {
        int max =-1;
        for(int i =0; i< nums.length;i++){
            int cnteven =0;
            int cntodd =0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=i; j <nums.length;j++){
                if(!map.containsKey(nums[j])){
                if(nums[j]%2==0)
                    cnteven++;
                else if(nums[j]%2!=0)
                    cntodd++;
                if(cnteven==cntodd)
                    max = Math.max(max, j-i+1);
                }
                else{
                    if(cnteven==cntodd)
                     max = Math.max(max, j-i+1);
                }
                 map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
           // map.put(nums[i],map.get(nums[i])-1);
        }
        return max==-1?0:max;
    }
}