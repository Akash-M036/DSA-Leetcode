class Solution {
    public boolean hasMatch(String s, String p) {
        for(int i=0;i<s.length();i++){
            boolean star=false;
            String s2="";
            String s1="";
            for(int j=i;j<p.length()+i;j++){
                if(j-i>=p.length())break;
                if(star){
                    s1=s1+p.charAt(j-i)+"";
                }
                if(p.charAt(j-i)=='*'){
                    star=true;
                    if(j-i==p.length()-1)return true;
                    s2="";
                    for(int k=j;k<s.length();k++){
                        s2=s2+s.charAt(k)+"";
                    }
                    continue;
                }
                if(!star&&(j>=s.length()||s.charAt(j)!=p.charAt(j-i))){
                    break;
                }
            }
            System.out.println(s2);
            System.out.println(s1);
            if(star&&s2.contains(s1))return true;
        }
        return false;
    }
}
