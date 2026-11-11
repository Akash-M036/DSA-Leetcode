class Solution {
    // public long choosingmin(int c1, int c2, int cb , int n1, int n2){
    //     if(n1==0 && n2==0) return 0;
    //     if(n1<0) return Long.MAX_VALUE;
    //     if(n2<0) return Long.MAX_VALUE;
    //     long choose1 = c1
    //     // >10^8
    // }
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(need1==0 && need2==0) return 0;
        long maxneeds = need1+need2;
        long ans1 = maxneeds*costBoth;
        int n1 = need1;
        int n2 = need2;
        long a1 = 1L*cost1*need1;
        long a2 = 1L*cost2*need2;
        long ans2=0;
        if(a1>a2){
            ans2 = 1L*costBoth*need1;
            need2-=need1;
            if(need2>0){
                ans2+= 1L*need2*cost2;
            }
        }
        else if(a1<=a2){
            ans2 = 1L*costBoth*need2;
            need1-=need2;
            if(need1>0){
                ans2+= 1L*need1*cost1;
            }
        }
        
        long ans3 = 1L*n1*cost1+1L*n2*cost2;
        need1 =n1;
        need2 =n2;
       // System.out.println(need1+ " "+ need2);
        long ans4 =0;
        if(a1>a2){
            ans4 = 1L*costBoth*need2;
            need1-=need2;
            if(need1>0){
                ans4+= 1L*need1*cost1;
            }
        }
        else if(a1<=a2){
            ans4 = 1L*costBoth*need1;
            need2-=need1;
            if(need2>0){
                ans4+= 1L*need2*cost2;
            }
        }
        // System.out.println(ans1);
        // System.out.println(ans2);
        // System.out.println(ans3);
        // System.out.println(ans4);
        return Math.min(ans4,Math.min(ans3,Math.min(ans1,ans2)));
    }
}
        // long ans2half= minneeds*costBoth;
        // int need2x =need2;
        // int need1x = need1;
        // if(minneeds==need1){
        //     need2x -= need1;
        //     ans2half += need2x*cost2;
        // }
        // if(minneeds==need1){
        //     need1x -= need2;
        //     ans2half += need1x*cost1;
        // }