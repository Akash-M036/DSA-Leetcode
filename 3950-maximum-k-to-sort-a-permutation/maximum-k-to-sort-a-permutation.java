class Solution {
    // 101, 1101,11101
    // 5,13,29
    // 0 3 1 2
    public int sortPermutation(int[] nums) {
        int ans = (1<<31)-1;
        boolean modi =false;
        boolean[] vis = new boolean[nums.length];
        for(int i =0; i< nums.length;i++){
            if(vis[i] || nums[i]==i) continue;
            int ori = nums[i];
            while(!vis[ori]){
                vis[ori]=true;
                int x = nums[ori];
                modi =true;
                //System.out.println(x +"&"+ ori);
                ans = ans&ori;
                ori = x;
            }
        }
        return modi? ans:0;
        // 101 , 110 - 4,2
    }
}