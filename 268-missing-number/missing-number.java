class Solution {
    public void swap(int i, int j , int[] arr){
        int t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public int missingNumber(int[] nums) {
        int i =0;
        while(i< nums.length){
            if(nums[i]<nums.length && nums[i]!=nums[nums[i]]){
            swap(i,nums[i],nums);
            }
            else
                i++;
        }
        if(nums[0]!=0)
            return 0;
        for( i =0; i< nums.length;i++){
           System.out.print(nums[i]+" ");
           if(nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}