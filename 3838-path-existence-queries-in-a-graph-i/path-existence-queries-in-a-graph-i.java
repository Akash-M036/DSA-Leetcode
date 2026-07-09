class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        int[] dup = new int[nums.length];
        int[] pre = new int[nums.length];
        for(int i = 0; i< nums.length-1; i++){
            if(Math.abs(nums[i]-nums[i+1])> maxDiff)
            dup[i+1]++;
        }
        pre[0]=dup[0];
        for(int i = 1; i< nums.length; i++){
            pre[i]=pre[i-1]+dup[i];
        }
        for(int i = 0; i<queries.length;i++){
            int low = queries[i][0];
            int high = queries[i][1];
            boolean val =false;
            if(low>0 && pre[high]-pre[low] == 0)
                val= true;
            if(low==0 && pre[high]==0)
                val=true;
            ans[i]= val;
        }
        return ans;
    }
}