class Solution {
    public String getSmallestString(String s, int k) {
        if(k==0) return s;
        String fin= "";
        for(char ch : s.toCharArray()){
            if(k==0){
                fin=fin+ch;
                continue;
            }
            int curr = ch-'a';
            int tomax = 26-curr;
            if(curr<13 && curr<=k){
                k-=curr;
                fin= fin+"a";
            }
            else if(curr>=13){
                if(tomax<=k){
                k-=tomax;
                fin = fin+"a";
                }
                else{
                curr= curr-k;
               // System.out.println((char)curr);
                k=0;
                fin =fin+(char)(curr+'a');
                }
            }
            else{
                curr= curr-k;
                k=0;
                fin =fin+(char)(curr+'a');
            }
            
        }
        return fin;
    }
}