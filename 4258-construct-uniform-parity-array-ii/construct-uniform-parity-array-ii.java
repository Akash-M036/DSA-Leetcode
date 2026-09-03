class Solution {
    /*
        o-o =e  --> start odd will be always odd
        e-o =o -->change to odd only
        e-e =e -->not req
    */
    // can calculate through min value
    public boolean uniformArray(int[] nums1) {
        int cntodd =0;
        int cnteven =0;
        for(int i =0; i< nums1.length;i++){
            if(nums1[i]%2==0)
                cnteven++;
            else
                cntodd++;
        }
        if(cnteven==0 || cntodd==0)
            return true;
        Arrays.sort(nums1);
         cntodd =0;
         cnteven =0;
         boolean ans =true;
         //odd
        for(int i =0; i< nums1.length;i++){
            if(nums1[i]%2!=1){
                if(cntodd==0){
                    ans = false;
                    break;
                }
            }
            if(nums1[i]%2==0)
                cnteven++;
            else
                cntodd++;

        }
         return ans;
    }
}