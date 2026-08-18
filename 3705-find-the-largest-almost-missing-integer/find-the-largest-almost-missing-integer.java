class Solution {
    public int largestInteger(int[] nums, int k) {
            int max =-1;
            for (int a : nums){
                    max = Math.max(a,max);
            }
        if(k==nums.length){
            return max;
        }
       
        int[] cnt= new int[max+1];
        for (int a : nums){
            cnt[a]++;
            }
         if(k==1){
            for(int i = cnt.length-1; i>=0;i--){
                if(cnt[i]==1)
                    return i;
            }
        }

        // for(int i =0; i< nums.length;i++){
        //     int left =i;
        //     int right = nums.length-i-1;
        //     if(left>=1 && right >=k-1)
        //         notsub[nums[i]]++;
        // }
        // return -1;
        int l = nums[0];
        int r = nums[nums.length-1];
            if(cnt[r]>1 && cnt[l]==1)
                return l;
            else if(cnt[l]>1 && cnt[r]==1)
                return r;
             else if(cnt[l]==1 && cnt[r]==1){
                int ans = Math.max(l,r);
                return ans;
             }
             return -1;
    }
}