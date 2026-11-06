class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        // for(int i =0; i< nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        int a=0;
       // int b =0;
        for(int i =0; i< nums.length;i++){
            if(map.getOrDefault(nums[i],0)>=2) continue;
            nums[a]=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            a++;
        }
        return a;
    }
}