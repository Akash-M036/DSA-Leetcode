class Solution {
    String[] pts = {"(", ")"};
    List<String> ans = new ArrayList<>();
    public void para(int n, StringBuilder sb, int cntl, int cntr) {
        if (sb.length() == 2 * n) {
            ans.add(sb.toString());
            return;
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0 && cntl >= n) continue;
            if (i == 1 && cntr >= cntl) continue;

            int left = (i == 0) ? 1 : 0;
            int right = (i == 1) ? 1 : 0;

            sb.append(pts[i]);
            para(n, sb, cntl + left, cntr + right);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
       
        para(n, new StringBuilder(), 0, 0);
        return ans;
    }
}
