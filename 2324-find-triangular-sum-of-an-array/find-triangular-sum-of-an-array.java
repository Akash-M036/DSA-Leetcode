class Solution {
    public int triangularSum(int[] nums) {
        // 1 + 2*2 + 3*2 +4*2 +5
        // 1 + 2*2 + 3
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0; i< nums.length;i++){
            arr.add(nums[i]);
        }
        while(arr.size()!=1){
             for(int i =0; i< arr.size()-1;i++){
                arr.set(i, (arr.get(i)+arr.get(i+1)) %10);
             }
             arr.remove(arr.size()-1);
        }
        return arr.get(0);
    }
}