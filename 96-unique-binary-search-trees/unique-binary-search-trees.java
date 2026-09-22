class Solution {
    //1,2,5,14,42,132,429, 
    /*
    f(4) = 
    - 4 at top = f(3)
    - 4 at second = f(2)+f(2)+f(2)
    -4 at third = 3+1
    - 4 at 4 = 1;

    -
    */
    public int comb(int n ){
        long val=1;
        for(int i =0;i<n;i++){

           val=val*(2*n-i)/(i+1);
        }
        long ans = val/(n+1);
        return (int)ans;
    }
    public int numTrees(int n) {
         return comb(n);
    }
}