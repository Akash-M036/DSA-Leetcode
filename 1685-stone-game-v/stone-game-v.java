class Solution {
    public int find(int a , int b, int[] st,int[][] dp){
        if(a==b) return 0;
        if(dp[a][b]!=-1)
            return dp[a][b];
        int[] pre = new int[b-a+1];
        int[] suff = new int[b-a+1];
        pre[0]=st[a];
        suff[suff.length-1]= st[b];
        for(int i =1; i< pre.length;i++){
            pre[i]=pre[i-1]+st[a+i];
        }
         for(int i =suff.length-2; i>=0;i--){
            suff[i]=suff[i+1]+st[a+i];
        }
        // int diff = Integer.MAX_VALUE;
        // int k1 = -1;
        // for(int i =0; i< pre.length-1;i++){
        //     if(Math.abs(pre[i]-suff[i+1])<diff){
        //         diff = Math.abs(pre[i]-suff[i+1]);
        //         k1= i;
        //     }
        //}
        int ans = -1;
        for(int k1 = 0; k1<b-a;k1++){
            int k = a+k1;
            if(pre[k1]>suff[k1+1])
                ans= Math.max(suff[k1+1]+find(k+1,b,st,dp),ans);
            else if(pre[k1]<suff[k1+1])
                ans= Math.max(pre[k1]+find(a,k,st,dp),ans);
            else
            ans = Math.max(Math.max(suff[k1+1]+find(k+1,b,st,dp), pre[k1]+find(a,k,st,dp)),ans);
        }
        return dp[a][b] = ans;
    }
    public int stoneGameV(int[] stoneValue) {
        int[][] dp = new int[stoneValue.length][stoneValue.length];
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }
        int ans = find(0,stoneValue.length-1,stoneValue,dp);
        return ans;
    }
}