class Solution {
    public int minOperations(String s) {
        if (s.length()<=1) return 0;
        boolean ok = true;
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i)>s.charAt(i+1)) {
                ok = false;
                break;
            }
        }
        if (ok) return 0;
        if (s.length()==2) return -1;
        char mn = 'z';
        char mx = 'a';
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c < mn) 
                mn = c;
            if (c > mx)
                 mx = c;
        }
        
        if (s.charAt(0) == mn || s.charAt(s.length()-1) == mx) 
            return 1;
        for (int i=1; i<s.length()-1; i++) {
            char c = s.charAt(i);
            if (c==mn || c==mx) return 2;
        }
          return 3;
    }
}
