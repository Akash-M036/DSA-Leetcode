class Solution {
    public int reverse(int x) {
        boolean neg = false;
        long val = 0;
        long dec = x;
        if(x<0 )
        {
             dec = -dec; 
            neg = true;
        }
        while(dec!=0){
            val = 1L*val*10+dec%10;
            dec/=10;
        }
        if(!neg){
            if(val> Integer.MAX_VALUE)
                return 0;
            return (int)val;
        }
        else{
            val = (-1)*val;
            if(val < Integer.MIN_VALUE)
                return 0;
            return (int)val;
        }
    }
}