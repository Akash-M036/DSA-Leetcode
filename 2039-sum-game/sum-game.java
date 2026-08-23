class Solution {
    public boolean sumGame(String num) {
        int n = (num.length())/2;
        int lq= 0;
        int rq =0;
        int ls =0;
        int rs =0;
        for(int i =0; i< num.length();i++){
            if(num.charAt(i)=='?')
                {
                    if(i<n) lq++;
                    if(i>=n) rq++;
                }
            else
                {
                    if(i<n) ls+=(num.charAt(i)-'0');
                    if(i>=n) rs+=(num.charAt(i)-'0');
                }
        }
        if(lq==0 && rq == 0)
            return ls!=rs;
        if(ls>rs && lq>rq) return true;
        if((lq+rq)% 2 != 0) return true;
        if(ls<rs && lq<rq) return true;
        else{
           if(ls<rs && lq>rq){
             int check = (lq+rq) /2;
             while(check>0 && rq>0){
                rq--;
                check--;
             }
              while(check>0){
                ls+=9;
                check--;
              }
               return ls!=rs;
           }
            else if (ls > rs && lq < rq) {
                int check=(lq+rq)/2;
                while (check>0 && lq>0) {
                    lq--;
                    check--;
                }
                while (check>0) {
                    rs+= 9;
                    check--;
                }
           
                //return ls!=rs;
            } 

             else if (ls == rs) 
                return lq != rq;
        }
        return ls!=rs;
    }
}