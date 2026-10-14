class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9<sum) return "";
        StringBuilder sb = new StringBuilder();
        while(sum>9){
            sb.append("9");
            sum-=9;
            num--;
        }
        sb.append(sum+"");
        num--;
        while(num!=0){
            sb.append('0');
            num--;
        }
        return sb.toString();
    }
}