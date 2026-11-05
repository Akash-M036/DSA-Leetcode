class Solution {
    /*
    4i 5 8
    1 8j 9 10
    */
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
       int[] pre = new int[2002];
       for(int a : arr2){
            pre[a+1000]++;
       }
       for(int i =1; i< pre.length;i++){
            pre[i]=pre[i-1]+pre[i];
       }
       int ans =0;
       for(int i =0; i< arr1.length;i++){
            int left = arr1[i]-d;
            int right =arr1[i]+d;
            left =Math.max(left,-1000);
            right=Math.min(right,1000);
            int cnt = pre[right+1000]-(left+1000-1>=0 ? pre[left+1000-1] : 0);
             //System.out.print(cnt + " ");
            // if(pre[arr1[i]+1000]-pre[arr1[i]+1000-1]>=1) cnt-=pre[arr1[i]+1000]-pre[arr1[i]+1000-1];
            //System.out.print(cnt + " ");
            if(cnt==0)
            ans++;
       }
       return ans;
    }
}