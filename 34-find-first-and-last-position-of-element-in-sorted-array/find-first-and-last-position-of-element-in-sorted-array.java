class Solution {
    public int ub(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans =-1;
        while(low<=high){
            int mid = (low+high)/2;
          //  System.out.println(nums[mid]);
            if(nums[mid]<=target){
                low = mid+1;
                ans = mid;
            }
            else
              high = mid-1;
              
        }
        return ans;
    }
     public int lb(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<target){
                  low = mid+1;
            }
            else if(nums[mid]>=target){
                high = mid-1;
                ans = mid;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lbval = lb(nums,target);
        int ubval = ub(nums,target);
        if(lbval!=-1 && ubval!=-1 && nums[lbval]==target && nums[ubval]==target)
            return new int[]{lbval,ubval};
        return new int[]{-1,-1};
        
    }
}