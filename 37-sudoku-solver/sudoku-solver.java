class Solution {
   
    public boolean cansolve(int i , int j ,char[][] board,int val){
        for(int l =0; l<9;l++){
            if(board[i][l]==(char)(val+'0'))
                return false;
            if(board[l][j]==(char)(val+'0'))
                return false;
        }
        int sti = i/3;
        int stj = j/3;
        HashSet<Character> set = new HashSet<>();
        set.add((char)(val+'0')); 
        for(int l=sti*3; l<=sti*3+2;l++){
            for(int m = stj*3;m<=stj*3+2;m++){
                if (l == i && m == j) continue;
                if (board[l][m] == '.') continue; 
                if(!set.contains(board[l][m]))
                    set.add(board[l][m]);
                else
                    return false;
            }
        }
        return true;

    }
    public boolean createboard(char[][] board){
        for (int r=0; r<9;r++) {
        for (int c=0; c<9;c++) {
            if (board[r][c] == '.') {
                for (int val = 1; val <= 9; val++) {
                    if (cansolve(r, c, board, val)) {
                        board[r][c] = (char)(val + '0');
                        if (createboard(board))
                            return true;
                        board[r][c] = '.';
                    }
                }
                return false;
            }
        }
    }
    return true;      
    }
    public void solveSudoku(char[][] board) {
        createboard(board);
    }
}