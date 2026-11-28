class Solution {
    
    public int maximumSaleItems(int[][] items, int budget) {
        int max=-1;
        int min=Integer.MAX_VALUE;
        for(int[] a : items){
            max = Math.max(max,a[0]);
            min = Math.min(min,a[1]);
        }
        int[] factors = new int[max+1];
        for(int[] a : items){
            for(int i =1;i*i<=a[0];i++){
                if(a[0]%i==0){
                    factors[i]++;
                    if(a[0]/i!=i)
                        factors[a[0]/i]++;
                }
            }
        }
        // int i =0;
        // for(int a : factors)
        //     System.out.println((i++)+"-"+a);
        // [[6, 6], [2, 8], [1, 10], [4, 12], [5, 17], [5, 20]]
        Arrays.sort(items,(a,b)-> Integer.compare(a[1],b[1]));
        int rem = budget;
        long ans =0;
        for(int i =0; i< items.length;i++){
            int fac = items[i][0];
            int price = items[i][1];
            int otherfac = factors[fac]-1;
            int qtycanbuy = rem/price;
            if(rem>=price && price<2L*min){
                int x = Math.min(otherfac,qtycanbuy);
                ans += x*2;
                rem = rem-x*price;
            }
        }
        ans+=rem/min;
        return (int)ans;
    }
}
