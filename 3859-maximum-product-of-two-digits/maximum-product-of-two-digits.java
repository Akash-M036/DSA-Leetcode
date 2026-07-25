class Solution {
    public int maxProduct(int n) {
        int max1 = -1;
        int max2= -1;
        while(n!=0){
            int val = n%10;
            if(val >= max1){
                max2 = max1;
                max1 =val;
            }
            if(val< max1 && val>= max2)
                max2=val;
            n=n/10;
        }
        return max1 * max2;
    }
}