class Solution {
    public int myAtoi(String s) {
        int ans =0;
        long val =0;
        boolean neg =false;
        int i =0;
        if(s.length()==0) return 0;
        if(s.charAt(i)=='-') neg =true;
        while(i< s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i< s.length() &&( s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-') neg =true;
            i++;
        }
        if(i==s.length()) return 0;
        while(i<s.length()){
            if(val==0 && s.charAt(i)=='0')
            {
                i++;
                continue;
            }
            if(s.charAt(i)-'0'>9 || s.charAt(i)-'0'<0 ) {
                break;
            }
            val = val*10+(s.charAt(i)-'0');
               if (val>Integer.MAX_VALUE) 
                break; 
            i++;
        }
        if(neg) val = -val;
        if(val<=Integer.MIN_VALUE)
            ans = Integer.MIN_VALUE;
        else if(val>= Integer.MAX_VALUE)
            ans = Integer.MAX_VALUE;
        else{
            ans = (int)val;
        }
        return ans;
    }
}