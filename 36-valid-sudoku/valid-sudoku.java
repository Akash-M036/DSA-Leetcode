class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i =0; i< board.length ; i+=3){
            for(int l =0; l< board[i].length ; l+=3){
        boolean[] valid = new boolean[10];
            for(int j=0; j < 3; j++){
                for(int k =0; k<3 ;k++){
                    if(board[i+j][l+k]-'0' <= 9 && board[i+j][l+k]-'0' >=0){
                        if(valid[board[i+j][l+k]-'0'])
                             return false;
                        valid[board[i+j][l+k]-'0']=true;
                    }
                }
            }
        }
        }
          for(int i =0; i<board.length; i++){
          boolean[] valid = new boolean[10];
            for(int j =0; j< board[i].length; j++){
                int val = board[j][i]-'0';
                if(board[j][i]!='.'){
                    if(valid[val])
                        return false;
                    valid[val]=true;
                }
            }
          }
          for(int i =0; i<board.length; i++){
          boolean[] valid = new boolean[10];
            for(int j =0; j< board[i].length; j++){
                int val = board[i][j]-'0';
                if(board[i][j]!='.'){
                    if(valid[val])
                        return false;
                    valid[val]=true;
                }
            }
          }
        return true;
    }
}