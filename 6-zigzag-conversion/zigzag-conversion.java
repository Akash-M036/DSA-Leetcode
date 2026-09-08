class Solution {
    public int down(char[][] st, String s, int k, int j) {
        for (int i = 0; i < st.length && k < s.length(); i++) {
            st[i][j] = s.charAt(k++);
        }
        return k;
    }
    public int cross(int i, int j, char[][] st, String s, int k) {
        while (i > 1 && k < s.length()) {
            i--;
            j++;
            st[i][j] = s.charAt(k++);
        }
        return k;
    }
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;
        char[][] st = new char[numRows][s.length()];
        int k =0;
        int j =0;
        while (k <s.length()) {
            k =down(st, s, k, j);
            if (k <s.length()) {
                k = cross(numRows - 1, j, st, s, k);
                j += numRows - 1;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int x = 0; x < s.length(); x++) {
                if (st[i][x] != '\0')
                    ans.append(st[i][x]);
            }
        }
        return ans.toString();
    }
}