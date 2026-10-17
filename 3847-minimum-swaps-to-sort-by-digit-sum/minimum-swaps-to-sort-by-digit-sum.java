class Solution {
    public int minSwaps(int[] nums) {
//int max =-1;
        //for(int a : nums) max = Math.max(max,a);
        int[][] val = new int[nums.length][3];
        int i =0;    
        for(int a : nums) {
            val[i][2]=a;
            val[i][1]=i;
            int sum=0;
            while(a!=0){
                sum+=a%10;
                a/=10;
            }
            val[i++][0]=sum;
        }
        Arrays.sort(val,(a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            else return Integer.compare(a[2],b[2]);
        });
        int ans =0;
        boolean[] vis = new boolean[nums.length];
        for( i=0; i< vis.length;i++){
            if(vis[i] || val[i][1]==i) continue;
            int cnt =0;
            int j =i;
            while(!vis[j]){
                vis[j]=true;
                cnt++;
                j=val[j][1];
            }
            ans+=cnt-1;
        }
        return ans;
// 4 3 2 1
//4 2 3 1

// 1 2 3 8 5 6 7
    }
}