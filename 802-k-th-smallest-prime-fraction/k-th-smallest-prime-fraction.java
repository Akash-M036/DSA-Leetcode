class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[][] check = new int[(int)1e6+1][2];
        int x =0;
        for(int[] a : check)
            Arrays.fill(a,1);
        int z =0;
        for(int i =0; i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
               // float val = 1.0*arr[i]/arr[i];
                check[z][0]=arr[i];
                check[z][1]=arr[j];
                z++;
            }
        }
        
        Arrays.sort(check,(a,b)->{
            if(1.0*a[0]/a[1]-1.0*b[0]/b[1]>0)
                return 1;
            return -1;
        });
        
       return check[k-1];        
    }
}