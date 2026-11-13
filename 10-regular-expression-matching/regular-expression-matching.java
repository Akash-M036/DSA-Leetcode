class Solution {
    private Boolean[][] dp;
    public boolean check(int i , int j ,String s, String p){
       // System.out.println(i+" "+j);
        if(i==s.length() && j==p.length()) return true;
        if(j==p.length()-1 && p.charAt(j)=='*') return true;
        if(i==s.length()-1 && j== p.length()-1 && p.charAt(j)=='.') return true;
       // if(i==s.length()) return false;
        if(j==p.length()) return false;
        if(dp[i][j]!=null) return dp[i][j];
        boolean a =false;
        boolean b = false;
       boolean c = false;
         boolean match = (i < s.length()) && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

       
        if (j < p.length() - 1 && p.charAt(j + 1) == '*') {
            a = check(i,j+2,s,p);                 
            if (match) 
                b=check(i+1,j,s,p);    
        } 
        else {
            if(match)
             c=check(i+1,j+1,s,p);
            }

        return dp[i][j] = a||b || c;
    }
    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length()+1][p.length()+1];
        // for(int[] r : dp)
        // Arrays.fill(r,-1);
        return check(0,0,s,p);

        // int i =0;
        // int j =0;
        // while(i<s.length()){
        //     if(s.charAt(i)==p.charAt(j)){
        //         i++;
        //         j++;
        //     }
        //     else{
        //         if(p.charAt(j)=='.'){
        //             i++;
        //             j++;
        //         }
        //         else if(p.charAt(j)=='*'){
        //             if(j==p.length()-1) return true;


        //         }
        //         else return false;
        //     }
        // }
    }
}