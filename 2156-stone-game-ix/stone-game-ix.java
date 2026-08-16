class Solution {
    public boolean stoneGameIX(int[] stones) {
        for(int i =0; i<stones.length;i++){
            stones[i] %=3;
        }
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i =0; i<stones.length;i++){
         if(stones[i]==0)
            cnt0++;
         else if(stones[i]==1)
            cnt1++;
         else
            cnt2++;
        }
        if(cnt1==cnt2) {
            if(stones.length%2==0 && cnt0 %2 == 0) return cnt1>0 || cnt2>0;
            else return false;
        }
        int check = Math.abs(cnt1-cnt2);
        if(cnt1>cnt2 ){
            if(cnt0%2==0 && cnt2>0)
                return true;
            else if(cnt0%2!=0 && check>2) return true;
        }

        else if(cnt2>cnt1){
             if(cnt0%2==0 && cnt1>0)
                return true;
            else if(cnt0%2!=0 && check>2) return true;
        }
        return false;
    }
}