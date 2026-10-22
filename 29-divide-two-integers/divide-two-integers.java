class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
        if(divisor == 1) return dividend;
        if(divisor == -1) {
            System.out.print("entered");
            return -dividend;
            }
        int sign = ((dividend >= 0 && divisor >0) || (dividend<0 && divisor<0))?1:-1;
        long divd= dividend;
        long divs = divisor;
        if(dividend<0 ){
            if( dividend == Integer.MIN_VALUE)
                divd = 2147483648L;
            else
            divd = -(dividend);
        }
        if(divisor<0){
            if( divisor == Integer.MIN_VALUE)
                divs = 2147483648L;
            else
             divs = -divisor;
        }
        int ans  =0 ;
        while(divd>=divs){
            divd = divd-divs;
            ans++;
        }
        if(sign<0)
            return -ans;
        return ans;
    }
}