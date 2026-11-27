class Solution {
    int[][] dp ;
    public int buy(int i, int[][] items,int b, int[] fac){
        if(b==0) return 0;
        if(i>=items.length) return 0;
        if(b<0) return Integer.MIN_VALUE;
        if(dp[i][b]!=-1)
            return dp[i][b];
        int repeat =0;
        int takeandmove =0;
        int next =0;
        if(b>=items[i][1]){
        repeat = 1+buy(i,items,b-items[i][1],fac);
        takeandmove = fac[items[i][0]]+buy(i+1,items,b-items[i][1],fac);
        }
        next = buy(i+1,items,b,fac);
        //System.out.println(i+ "->"+Math.max(takeandmove,Math.max(repeat,next)));
        return dp[i][b] = Math.max(takeandmove,Math.max(repeat,next));
    }
    public int maximumSaleItems(int[][] items, int budget) {
        int max1 =Integer.MIN_VALUE;
        for(int[] a:items){
            max1= Math.max(max1,a[0]);
        }
        int[] factors = new int[max1+1];
        for(int[] a:items){
           for(int i =1;i*i<=a[0];i++){
            if(a[0]%i==0) {
                factors[i]++;
                if(a[0]/i!=i)
                factors[a[0]/i]++;
            }

           }
        }
        dp = new int[items.length+1][budget+1];
        for(int[] r : dp)
        Arrays.fill(r,-1);
        // int i =0;
        // for(int a : factors)
        // System.out.println((i++)+"="+a);
        return buy(0,items,budget,factors);

    }
}