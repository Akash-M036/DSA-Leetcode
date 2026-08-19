class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Arrays.sort(reservedSeats, (a, b) -> {
        if(a[0]!=b[0]) return a[0]-b[0];
        return a[1]-b[1];
        });
        int ans = 0;
        int cnt = 0;
        int i = 0;
        int m = reservedSeats.length;
        while(i<m) {
            int row = reservedSeats[i][0];
            boolean[] res = new boolean[11];
            cnt++;
            while(i<m && reservedSeats[i][0]==row) {
                int col = reservedSeats[i][1];
                res[col] = true;
                i++;
            }
            boolean left= !res[2] && !res[3] && !res[4] && !res[5];
            boolean middle= !res[4] && !res[5] && !res[6] && !res[7];
            boolean right= !res[6] && !res[7] && !res[8] && !res[9];
            if(left&&right) {
                ans+=2;
            }
            else if(left||middle||right) {
                ans+=1;
            }
        }

        int empty=n-cnt;
        ans+=empty*2;
        return ans;
        }
}