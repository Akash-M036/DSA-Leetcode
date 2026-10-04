class Solution {
    public boolean traver(int i , String s,int cnt,Boolean[][] dp){
        if(i>=s.length() && cnt==0) return true;
        if(i>=s.length()) return false;
        if(cnt<0) return false;
        if(dp[i][cnt]!=null) return dp[i][cnt];
        boolean left = false;
        boolean right =false;
        boolean s1=false;
        boolean s2= false;
        boolean s3 = false;
        if(s.charAt(i)=='(')
            left = traver(i+1,s,cnt+1,dp);
        else if(s.charAt(i)==')')
            right = traver(i+1,s,cnt-1,dp);
        else{
        s1 = traver(i+1,s,cnt+1,dp);
        s2 = traver(i+1,s,cnt-1,dp);
        s3 = traver(i+1,s,cnt,dp);
        }
        return dp[i][cnt]= left || right || s1 || s2 || s3;
    }
    public boolean checkValidString(String s) {
        Boolean[][] dp = new Boolean[s.length()+1][s.length()+1];
        return traver(0,s,0,dp);
    }
}