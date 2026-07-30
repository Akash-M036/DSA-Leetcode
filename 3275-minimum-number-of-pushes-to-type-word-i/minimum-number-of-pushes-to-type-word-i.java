class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        if(len<=8){
            return len;
        }
        else if(len<=16){
            return (len-8)*2+8;
        }
        else if(len<=24){
            return (len-16)*3+16+8;
        }
        return (len-24)*4+24+16+8;
    }
}