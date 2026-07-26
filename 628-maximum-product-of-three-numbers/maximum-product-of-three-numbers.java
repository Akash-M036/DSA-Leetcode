class Solution {
    public int maximumProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        int m3 = Integer.MIN_VALUE;
        for(int a : nums){
            if(m1<a){
                m3=m2;
                m2=m1;
                m1=a;
            }
            else if(m2<a){
                m3 = m2;
                m2 = a;
            }
            else if(m3<a){
                m3=a;
            }
        }
        int neg2 = Integer.MAX_VALUE;
        int neg3 = Integer.MAX_VALUE;
        for(int a : nums){
            if(neg2>a){
                neg3 = neg2;
                neg2 = a;
            }
            else if(neg3>a){
                neg3 = a;
            }
        }
        if( (int)m1 *neg2*neg3 > (int)m1*m2*m3)
            return (int) neg2 *neg3 * m1 ;

        return (int)m1*m2*m3;

    }
}