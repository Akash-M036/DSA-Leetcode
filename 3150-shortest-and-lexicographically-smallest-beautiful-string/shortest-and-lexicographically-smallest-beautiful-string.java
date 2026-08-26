class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int ones = 0;
        int min = Integer.MAX_VALUE;
        String ans = "";
        for (int right=0;right<s.length();right++) {
            if (s.charAt(right)=='1') {
                ones++;
            }
            while (ones==k) {
                int len=right-left+1;
                if (len<min) {
                    min=len;
                    ans=s.substring(left, right + 1);
                }
                 else if (len==min) {
                    String sub = s.substring(left, right + 1);
                    if (sub.compareTo(ans) < 0) {
                        ans = sub;
                    }
                }
                if (s.charAt(left)=='1') {
                    ones--;
                }
                left++;
            }
        }
        return ans;
    }
}