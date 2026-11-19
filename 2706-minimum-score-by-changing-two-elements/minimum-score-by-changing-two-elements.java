class Solution {
    public int minimizeSum(int[] nums) {
        if(nums.length<=3) return 0;
        // 1 4 5 7 8
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
         int min3 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int a : nums){
            if(max1<=a){
                max3 =max2;
                max2=max1;
                max1=a;
            }
            else if(max2<=a){
                max3=max2;
                max2=a;
            }
            else if(max3<a){
                max3=a;
            }
            if(min1>=a){
                min3=min2;
                min2= min1;
                min1=a;
            }
            else if(min2>=a){
                min3=min2;
                min2=a;
            }
            else if (min3>a){
                min3=a;
            }
        }
       // System.out.println(max2+" "+max3);
        // int diff = max1-min3;
        // diff =diff/2;
        // int x = min3+diff;
        // min1 = x =min2;
        int a = 0+max1-min3;
        int b = max3-min1;
        int c = max2-min2;
       // System.out.println(a+" "+b+" "+c);
        return Math.min(a,Math.min(b,c));

    }
}
// 9 27 33 59 81
// 8 28 42 58 75