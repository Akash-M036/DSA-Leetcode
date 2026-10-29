class Solution {
    public long maxArea(int[][] coords) {
        long maxm=-1;
        int minx=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        int miny=Integer.MAX_VALUE;
        int maxy=Integer.MIN_VALUE;
        for(int i=0;i<coords.length;i++){
            minx=Math.min(minx,coords[i][0]);
            maxx=Math.max(maxx,coords[i][0]);
            miny=Math.min(miny,coords[i][1]);
            maxy=Math.max(maxy,coords[i][1]);
        }
        Arrays.sort(coords,(a,b)->{
            if(a[0]==b[0])
                return a[1]-b[1];
            return a[0]-b[0];
        });
        int i=0;
        while(i<coords.length){
            int start=i;
            while(i<coords.length && coords[i][0]==coords[start][0]){
                i++;
            }
            int end=i-1;
            if(end>start){
                long curr=coords[end][1]-coords[start][1];
                long h=Math.max(coords[start][0]-minx,maxx-coords[start][0]);
                maxm=Math.max(maxm,curr*h);
            }
        }
        Arrays.sort(coords,(a,b)->{
            if(a[1]==b[1])
                return a[0]-b[0];
            return a[1]-b[1];
        });
        i=0;
        while(i<coords.length){
            int start=i;
            while(i<coords.length && coords[i][1]==coords[start][1]){
                i++;
            }
            int end=i-1;
            if(end>start){
                long curr=coords[end][0]-coords[start][0];
                long h=Math.max(coords[start][1]-miny,maxy-coords[start][1]);
                maxm=Math.max(maxm,curr*h);
            }
        }
        return maxm==0?-1:maxm;
    }
}
