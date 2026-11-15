class Solution {
/*
    x is odd
    6-
    5-3
    4-3
    3-2
    2-2
    1-1
    0-1
    1+n/2
    x is even
    4-2
    3-2
    2-1
    1-1
    0-0
    n+1 /2
    1 2 3 4 5 6 7 
    n/2
    1-1*2
    3-1*(1+n/2)-1*2
    5-1
    7-1
    sum to 6


    */
    public int numOfSubarrays(int[] arr) {
        int mod=(int)1e9+7;
        long ans = 0;
        long evensum = 0;
        long oddsum = 0;
        long evens = 0;
        long idx = 0;
        for (int i = 0;i<arr.length;i++) {
            if (arr[i]%2 == 0) {
                evens++;
            } 
            else {
                long w = evens + 1;
                if (idx%2 == 0) {
                    ans = (ans+w*oddsum) % mod;
                    evensum = (evensum+w) % mod;
                } 
                else {
                    ans = (ans+w*evensum) % mod;
                    oddsum = (oddsum+w) % mod;
                }
                idx++;
                evens = 0;
            }
        }
        long w = evens + 1;
        if (idx%2 == 0) {
            ans = (ans+w*oddsum) % mod;
        } 
        else {
            ans = (ans+w*evensum) % mod;
        }
        return (int)ans;
    }
}
