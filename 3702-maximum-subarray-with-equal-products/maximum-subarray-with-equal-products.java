class Solution {
    public int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public int maxLength(int[] nums) {
       // if(nums.length==2) return 2;
      int l =0;
      int maxlen =2;
      int pro =1;
      for(int r =0;r<nums.length;r++){
        while(l<nums.length && gcd(pro,nums[r])!=1){
            pro=pro/nums[l];
            l++;
        }
       maxlen=Math.max(maxlen,r-l+1);
        pro*=nums[r];
      }
    return maxlen;
    }
}