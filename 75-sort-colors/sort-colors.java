class Solution {
    public void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int l =0;
        //int m=l+1;
        int r= nums.length-1;
        int mid = 0;
        while(l<=r && mid<=r && l<=mid){
            if(nums[mid]==0){
                swap(l,mid,nums);
                l++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(mid,r,nums);
                r--;
            }
            else{
                mid++;
            }
            // if(l>=m)
            // m=l+1;
            // if(nums[l]==0)
            //     l++;
            // else if(nums[l]==2){
            //     swap(l,r,nums);
            //     r--;
            // }
            // else{
            //     swap(l,m,nums);
            //     m++;
            // }
            // if(nums[r]==2)
            //     r--;
            // else if(nums[r]==1){
            //     swap(l,r,nums);
            //     l++;
            // }
            // else{
            //     swap(r,m,nums);
            //     m++;
            // }
            // if(nums[m]==1)
            //     m++;
            // else if(nums[m]==2){
            //     swap(m,r,nums);
            //     r--;
            // }
            // else{
            //     swap(m,l,nums);
            //     l++;
            // }
            
        }
    }
}