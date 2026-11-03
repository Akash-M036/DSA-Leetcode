class Solution {
    /*
    
    
    */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int[][] diff = new int[arr.length][2];
        for(int i =0; i< arr.length;i++){
            diff[i][0]= arr[i];
            diff[i][1]= Math.abs(arr[i]-x);
        }
        Arrays.sort(diff,(a,b)->{
            if(a[1]!=b[1]) return a[1]-b[1];
            return a[0]-b[0];
        });
        for(int i =0;i<k;i++){
            ans.add(diff[i][0]);
        }
        Collections.sort(ans);
        return ans;

    }
}