class Solution {
    public int reverseDegree(String s) {
        int i =1;
        int ans =0;
        for( char ch : s.toCharArray()){
            ans +=((26-ch+'a')*i);
            i++;
        }
        return ans;
    }
}