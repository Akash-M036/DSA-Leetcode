class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t = "1" + s + "1"; 
        int i = 1; 
        int ans = 0;
        int totone=0;
        for(int l =0; l<s.length();l++){
            if(s.charAt(l)=='1')
                totone++;
        }
        while (i < t.length() - 1) {
            int j = i;
            int leftzero = 0;
            int rightzero = 0;
            int one = 0;

            while (j < t.length() - 1 && t.charAt(j) == '0') {
                leftzero++;
                j++;
            }

            while (j < t.length() - 1 && t.charAt(j) == '1') {
                one++;
                j++;
            }

            int k = j;
            while (k < t.length() - 1 && t.charAt(k) == '0') {
                rightzero++;
                k++;
            }
            
            if (leftzero > 0 && rightzero > 0) {
                ans = Math.max(ans, rightzero + leftzero );
            }

            if (j == i) {
                i++;
            } else {
                i = j;
            }
        }
        return ans+totone;
    }
}
