class Solution {
    public int[] resultArray(int[] nums) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> last1 = new ArrayList<>();
        ArrayList<Integer> last2 = new ArrayList<>();
        last1.add(nums[0]);
        last2.add(nums[1]);
        for(int i =2; i< nums.length;i++){
            if(last1.get(last1.size()-1)>last2.get(last2.size()-1)){
                last1.add(nums[i]);
            }
            else{
                last2.add(nums[i]);
            }
        }
        int i =0;
        for(int a : last1){
            ans[i]=a;
            i++;
        }
         for(int a : last2){
            ans[i]=a;
            i++;
        }
        return ans;
    }
}