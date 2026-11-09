class Solution {
    public int idxstart(int[] nums){
        int l =0;
        int r = nums.length-1;
         while(l<=r){
            int mid =(l+r)/2;
            if(mid>0 && nums[mid-1]>nums[mid])
                return mid;
            if (mid <nums.length-1 && nums[mid]>nums[mid + 1])
                return mid + 1;
            
          if (nums[l]==nums[mid] && nums[mid]==nums[r]) {
                if (l<r && nums[l]>nums[l+1])
                    return l+1;
                if (l<r && nums[r-1]>nums[r])
                    return r;
                l++;
                r--;
            }
            else if (nums[mid] > nums[l] || (nums[mid]==nums[l] && nums[mid]>nums[r])) {
                l =mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return (l>=nums.length) ? 0 : l;
    }
    public boolean startsearch(int[] nums, int start, int end,int target){
        int l = start;
        int r = end;
        while(l<=r){
            int mid =(l+r)/2;
            if(nums[mid]==target) return true;
            if(nums[mid]<target) l=mid+1;
            else r= mid-1;
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        if(nums.length==1) return nums[0]==target;
        int start = idxstart(nums);
        System.out.println(start);
        boolean search1 = startsearch(nums,0,start-1,target) ||  startsearch(nums,start,nums.length-1,target); 
        return search1;
    }
}