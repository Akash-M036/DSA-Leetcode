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
        long c1 = cost1;
        long c2 = cost2;
        long cb = costBoth;
        long n1 = need1;
        long n2 = need2;
        long maxneeds = n1+n2;
        long ans1 = maxneeds*cb;
        long a1 = c1*n1;
        long a2 = c2*n2;
        long ans2=0;
        long t1 = n1;
        long t2 = n2;
        if(a1>a2){
            ans2 = cb*t1;
            t2-=t1;
            if(t2>0){
                ans2+= t2*c2;
            }
        }
        else if(a1<=a2){
            ans2 = cb*t2;
            t1-=t2;
            if(t1>0){
                ans2+= t1*c1;
            }
        }
        long ans3 = n1*c1+n2*c2;
        long ans4 =0;
        t1 = n1;
        t2 = n2;
        if(a1>a2){
            ans4 = cb*t2;
            t1-=t2;
            if(t1>0){
                ans4+= t1*c1;
            }
        }
        else if(a1<=a2){
            ans4 = cb*t1;
            t2-=t1;
            if(t2>0){
                ans4+= t2*c2;
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