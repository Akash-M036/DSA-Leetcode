class Solution {
    String s ="1";
    public void countAndSay(int n,int max){
        if(max==1) return;
        if(n==max || n>max) return ;
        StringBuilder sb = new StringBuilder();
        int cnt =1;
        for(int i =1; i< s.length();i++){
           if(s.charAt(i)==s.charAt(i-1))
            cnt++;
        else{
            sb.append(cnt+""+s.charAt(i-1));
            cnt=1;
        }
        }
        if(cnt!=0){
            sb.append(cnt+""+s.charAt(s.length()-1));
        }
        s= sb.toString();
        System.out.println(s);
        countAndSay(n+1,max);
        return;
    }
    public String countAndSay(int n) {
        if(n==1) return "1";
        countAndSay(1,n);
        return s;
    }
}