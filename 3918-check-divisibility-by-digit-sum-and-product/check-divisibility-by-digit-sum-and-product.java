class Solution {
    public boolean checkDivisibility(int n) {
        int digsum=0;
        int digpro=1;
        int l =n;
        while(n!=0){
            int k = n%10;
            digsum+=k;
            digpro*=k;
            n/=10;
        }
        return l%(digsum+digpro)==0? true: false;
    }
}