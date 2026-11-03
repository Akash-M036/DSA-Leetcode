class Solution {
    int ans =0;
    public int lenofinc(int i,int[] n1, int[] n2,int ratio,int[][] dp){
        if(i>=n1.length) return 0;
       //  System.out.println(i+" "+ans);
       if(dp[i][ratio]!=-1) return dp[i][ratio];
        int prev= -1;
        if(ratio==0)
        prev=n1[i-1];
        if(ratio==1)
        prev =n2[i-1];
        int t1= -1;
        int t2=-1;
        if(prev<=n1[i]){
         t1 = 1+lenofinc(i+1,n1,n2,0,dp);
        }
        if(prev<=n2[i])
         t2 =1+lenofinc(i+1,n1,n2,1,dp);
       //   System.out.println(t1+"t1, "+t2+"t2");
        if(t1==-1 && t2==-1)   return dp[i][ratio]= 0;
        // ans = Math.max(ans,Math.max(t1,t2));
         return dp[i][ratio] = Math.max(t1,t2);
    }
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length+1][3];
        for(int[] r:dp)
        Arrays.fill(r,-1);
        int ans =-1;
       for(int i =0; i<nums1.length;i++){
            ans = Math.max(ans, 1+lenofinc(i+1,nums1,nums2,0,dp));
            ans = Math.max(ans, 1+lenofinc(i+1,nums1,nums2,1,dp));
       }
       return ans;
        // int prev =-1;
        // int[] nums=  new int[nums1.length];
        // for(int i =0;i < nums1.length;i++){
        //     int a = nums1[i];
        //     int b = nums2[i];
        //     int max = Math.max(a,b);
        //     int min = Math.min(a,b);
        //     if(prev==-1 || min>=prev){
        //        nums[i]=min;
        //        prev=min;
        //         continue;
        //     }
        //     if(max>=prev){
        //       nums[i]=max;
        //       prev=max;
        //     }
        //     else{
        //        nums[i]=min;
        //        prev=min;
        //     }
        // }
        // int maxans=0;
        // int len=0;
        // prev=-1;
        // for(int i =0; i< nums1.length;i++){
        //     System.out.println(nums[i]);
        //     if(prev<=nums[i]){
        //         len++;
        //     }
        //     else{
        //         len=1;
        //     }
        //         prev=nums[i];
        //      //System.out.println(len);
        //     maxans= Math.max(len,maxans);
        // }
        // return maxans;
    }
}