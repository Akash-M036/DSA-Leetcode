class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] f = new int[26];
        for (char c : s.toCharArray()) {
            f[c - 'a']++;
        }
        String m = "";
        StringBuilder hb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (f[i] % 2 != 0) {
                m = String.valueOf((char) (i + 'a'));
            }
            int t = f[i] / 2;
            for (int j = 0; j < t; j++) {
                hb.append((char) (i + 'a'));
            }
        }
        char[] hc = hb.toString().toCharArray();
        Arrays.sort(hc);
        String fh = new String(hc);
        String sh = new StringBuilder(fh).reverse().toString();
        return fh + m + sh;
    }
}
