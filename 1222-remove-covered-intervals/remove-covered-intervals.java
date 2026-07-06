class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       Arrays.sort(intervals, (a,b)->{
       if(a[0]!=b[0])
            return (a[0]-b[0]);
        return b[1]-a[1];
    }); 
    int totint=0;
    int start = intervals[0][0];
    int end = intervals[0][1];
    boolean[] merge = new boolean[intervals.length];
   for(int i =0; i<intervals.length;i++){
    for(int j=0; j< intervals.length;j++){
        if(i==j)
            continue;
        if(!merge[i] && !merge[j] && intervals[i][0]<=intervals[j][0]  && intervals[i][1]>=intervals[j][1] ){
            merge[j]=true;
        }
    }
   }
    for(int i =0; i<intervals.length;i++){
        if(!merge[i])
            totint++;
    }
    return totint;
    }
}