class Solution {
    public int checkk(int n , int k){
        return (n&(1<<k))>0?1:0;
    }
    public int setk(int n , int k){
        return n |(1<<k);
    }
    public int delk(int n , int k){
        return n &(~(1<<k));
    }
    public int reverseBits(int n) {
        int ans =0;
        int l=0;
        int r =31;
        while(l<r){
            int temp1 = checkk(n,l);
            int temp2 =checkk(n,r);
            if(temp1==0){
                n = delk(n,r);
            }
            else{
                n = setk(n,r);
            }
            if(temp2==0){
                n= delk(n,l);
            }
            else{
                n=setk(n,l);
            }
            l++;
            r--;
        }
        return n;
    }
}