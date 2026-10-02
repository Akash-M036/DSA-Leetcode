class Solution {
    String[] pts = {"(", ")"};
    List<String> ans = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public void para(int cntl, int cntr, int n) {
        if(cntl+cntr== 2*n && cntl==n && cntr ==n){
            if(!ans.contains(sb.toString()))
            ans.add(sb.toString());
            return ;
        }
        if(cntr>cntl || cntl+cntr>2*n)
            return;
        sb.append('(');
        para(cntl+1,cntr,n);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        para(cntl,cntr+1,n);
         sb.deleteCharAt(sb.length()-1);
         sb.append('(');
         sb.append(')');
        para(cntl+1,cntr+1,n);
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        return;
        
    }
    public List<String> generateParenthesis(int n) {
       para(0,0,n);
       return ans;
    }
}
