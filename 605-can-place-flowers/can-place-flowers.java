class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k =0;
        for(int i =0; i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if((i==0 || flowerbed[i-1]==0)){
                if(i==flowerbed.length-1 || flowerbed[i+1]==0)
                    {
                        flowerbed[i]=1;
                        k++;
                    }
            }
            }
            else{
               // System.out.println(i);
                 if((i>0 && flowerbed[i-1]==0)){
                if(i<flowerbed.length-1 && flowerbed[i+1]==1)
                    return false;
            }
            if((i>0 && flowerbed[i-1]==1)){
                if(i<flowerbed.length-1 && flowerbed[i+1]==1)
                   return false;
            }
            }
        }
        //System.out.println(k);
        return n<=k;
    }
}