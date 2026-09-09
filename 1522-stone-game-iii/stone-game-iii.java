class Solution {
    public int rec(int idx,int[] st,int choice,Integer[][] dp){
         if(idx>=st.length)
            return 0;
        if(dp[idx][choice]!=null)
            return dp[idx][choice];
        if(choice==0){
            int a = Integer.MIN_VALUE;
            int b = Integer.MIN_VALUE;
            int c = Integer.MIN_VALUE;
             a = st[idx]+rec(idx+1,st,1,dp);
             if(idx+1<st.length)
             b = st[idx]+st[idx+1]+rec(idx+2,st,1,dp);
             if(idx+2<st.length)
             c = st[idx]+st[idx+1]+st[idx+2]+rec(idx+3,st,1,dp);
             return dp[idx][choice] =Math.max(Math.max(a,b),c);
        }
        if(choice==1){
            int a =Integer.MAX_VALUE;
            int b =Integer.MAX_VALUE;
            int c =Integer.MAX_VALUE;
             a = rec(idx+1,st,0,dp);
             if(idx+1<st.length)
             b = rec(idx+2,st,0,dp);
             if(idx+2<st.length)
             c = rec(idx+3,st,0,dp);
             return dp[idx][choice] =Math.min(Math.min(a,b),c);
        }
        return 0;
    }
    public String stoneGameIII(int[] stoneValue) {
        Integer[][] dp = new Integer[stoneValue.length][3];
       // for(int[] r : dp)
       // Arrays.fill(r,-1);
        int maxalice = rec(0,stoneValue,0,dp);
        int all =0;
        for(int i= 0; i<stoneValue.length;i++){
            all+=stoneValue[i];
        }
        if(all-maxalice>maxalice)
            return "Bob";
        if(all==2*maxalice)
            return "Tie";
        return "Alice";
        }
}