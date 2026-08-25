class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] values = new int[201];
        for(int i =0; i< nums.length;i++){
            values[nums[i]]=1;
        }
        for(int i =k ; i<=100+k;i+=k){
            if(values[i]==0)
                return i; 
        }
        return 0;
    }
}