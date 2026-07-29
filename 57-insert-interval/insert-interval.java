class Solution {
    public int[][] insert(int[][] intervals, int[] ni) {
        List<int[]> ans = new ArrayList<>();
        int idx = 0;
        int len = intervals.length;

        while (idx < len && intervals[idx][1] < ni[0]) {
            ans.add(intervals[idx]);
            idx++;
        }
        while (idx < len && intervals[idx][0] <= ni[1]) {
            ni[0] = Math.min(ni[0], intervals[idx][0]);
            ni[1] = Math.max(ni[1], intervals[idx][1]);
            idx++;
        }
        ans.add(ni);
        while (idx < len) {
            ans.add(intervals[idx]);
            idx++;
        }
        int[][] arr = new int[ans.size()][2];
        for(int i = 0; i< ans.size();i++){
            arr[i][0] = ans.get(i)[0];
            arr[i][1] = ans.get(i)[1];
        }
        return arr;
    }
}
