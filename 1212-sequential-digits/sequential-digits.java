class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int lowdig=0;
        List<Integer> ans = new ArrayList<>();
        int l =low;
        while(l!=0){
            l=l/10;
            lowdig++;
        }
        int val=0;
        for(int i=1;i<=lowdig;i++){
            val=val*10+ i ;
        }
        int digpush = lowdig+1;
        while(val<=high){
            if(val>=low){
                ans.add(val);
            }
            if(digpush>9){
                lowdig++;
                digpush = lowdig+1;
                val=0;
         for(int i=1;i<=lowdig;i++){
            val=val*10+ i ;
              }
               continue;
            }
      

            int del = (int) ((int)(val / Math.pow(10, lowdig - 1)) * Math.pow(10, lowdig - 1));
            val = (val-del)*10+digpush;
            digpush++;

        }
        return ans;
    }
}