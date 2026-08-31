class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            map.put(nums[i],1);
        }
        int ans = 1;
        for(int i =0; i<nums.length;i++){
           if(map.getOrDefault(nums[i]+1,0)==0 && map.getOrDefault(nums[i],0)!=0){
            int j =nums[i];
            int cnt =0;
                while(map.getOrDefault(j,0)!=0){
                    cnt++;
                    map.put(j,0);
                    j--;
                }
            ans = Math.max(ans,cnt);
           }
        }
        return ans;
    }
}