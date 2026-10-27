class Solution {
    public String[] createGrid(int m, int n) {
        String[] arr = new String[m];
        for(int i =0; i< m;i++){
            if(i==m-1){
                arr[i]=".".repeat(n);
                break;
            }
            String s  = ".";
            s = s+ "#".repeat(n-1);
            arr[i]=s;
        }
        return arr;
    }
}