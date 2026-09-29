class Solution {
    public boolean hasValidPath(char[][] grid) {
        if((grid.length+grid[0].length-1)%2!=0)
            return false;
        if( grid[0][0] == ')'||grid[grid.length-1][grid[0].length-1]=='(') return false;
        boolean[][][] dp = new boolean[grid.length+1][grid[0].length+1][(grid.length+grid[0].length-1)];
        dp[0][0][1]=true;
        
        // for(int i =0; i<grid.length;i++){
        //     for(int j =0; j< grid[i].length;j++){
        //         dp[i][j][0]=true;
        //     }
        // }
        int max = (grid.length+grid[0].length)/2;
        for(int i =0; i<grid.length;i++){
            for(int j =0; j< grid[i].length;j++){
                for(int k =0; k<=max;k++){
                    if(!dp[i][j][k])
                        continue;
                    if(i+1< grid.length)
                        {
                            int y =k+(grid[i+1][j]=='('?1:-1);
                             if (y >= 0 && y <= max) dp[i+1][j][y] = true;
                        }
                        if(j+1< grid[0].length)
                        {
                            int y =k+(grid[i][j+1]=='('?1:-1);
                            if (y >= 0 && y <= max) dp[i][j+1][y] = true;
                        }
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1][0];
    }
}