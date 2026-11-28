class Solution {
    public void  rev(int st , int end, int[] nums){
        while(st<end){
        int temp = nums[st];
        nums[st]=nums[end];
        nums[end]=temp;
        st++;
        end--;
        }
    }
    // 1 2 3 4 5 6 7
    // 1 2 3 4 7 6 5
    // 4 3 2 1 7 6 5

    // 5 6 7 4 5 1 2 3
    // 5 6 7 1 2 4 5 3


    // 1 2 3 4 5 6 7 8 9 10
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==0) return;
        int swap_start = nums.length-k;
    //    while(swap_start<nums.length){
    //     swap(swap_start,ori_start,nums);
    //     ori_start++;
    //     swap_start++;
    //     }
       rev(swap_start,nums.length-1,nums);
    //    for(int i =0;i< nums.length;i++){
    //     System.out.println(nums[i]);
    //    }
       rev(0,swap_start-1,nums);
       rev(0,nums.length-1,nums);
    }
}