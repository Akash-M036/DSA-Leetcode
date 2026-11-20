class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]!=b[0])
            return a[0]-b[0];
            return a[1]-b[1];
        });
        int len =0;
        int i =0;
        while(i<intervals.length){
            int x = intervals[i][1];
            while(i+1<intervals.length && x>=intervals[i+1][0]){
                x= Math.max(x,intervals[i+1][1]);
                i++;
            }
            len++;
            i++;
        }
        System.out.println(len);
        int[][] ans = new int[len][2];
        i=0;
        int x1=0;
        while(i<intervals.length){
            ans[x1][0] = intervals[i][0];
            int x = intervals[i][1];
            while(i+1<intervals.length && x>=intervals[i+1][0]){
                x= Math.max(x,intervals[i+1][1]);
                i++;
            }
            ans[x1][1]=x;
            len++;
            x1++;
            i++;
        }
        return ans;
    }
}