class Solution {
    Set<String> ans = new HashSet<>();
    public void listmake(int i, int cnt, String make, String s, int ro, int rc){
        if(i>=s.length()){
            if(cnt==0 && ro==0 && rc==0) ans.add(make);
            return;
        }
        if(cnt<0)
            return;
        int x =0;
        if(s.charAt(i)==')')
            x=-1;
        if(s.charAt(i)=='(')
            x=1;
        listmake(i+1,cnt+x,make+s.charAt(i),s,ro,rc);
        if(s.charAt(i)=='(' && ro>0)
            listmake(i+1,cnt,make,s,ro-1,rc);
        if(s.charAt(i)==')' && rc>0)
            listmake(i+1,cnt,make,s,ro,rc-1);
        return ;
    }
    public List<String> removeInvalidParentheses(String s) {
        int ro = 0;
        int rc = 0;
        for(char ch : s.toCharArray()){
            if(ch=='(')
                ro++;
            else if(ch==')'){
                if(ro>0) 
                    ro--;
                else 
                    rc++;
            }
        }
        listmake(0,0,"",s,ro,rc);
        return new ArrayList<>(ans);
    }
}
