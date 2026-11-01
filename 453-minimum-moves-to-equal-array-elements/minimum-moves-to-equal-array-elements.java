class Solution {
    /*
    +ve - x =x
    -ve - x=3x moves
    for 1 2 4
    - 234,344,454,555
    for 4 -6 9 15 ---> +21--->15,30,25,15--->+15--->30,30,40,30---->+10--->46
    4 6 9 15 --->+11----> 15 15 17 20 --->+5--->20 20 20 22 ---->+2---->22 22 22 22
    - 10 0 15 15 in 6 moves
    - 15 5 20 15 in 5 moves - 15,5,15,20
    - 20,10,20,20 in 5 moves
    - 30,20,30,20 -10 moves
    - 30 30 40 30 -10 moves
    - 40 40 40 40 -10 moves -->46 moves
     4 -7 9 15 -49 moves
     4 -8 9 15 -52 moves
     a[final] =  
    */
    public int minMoves(int[] nums) {
       int done =1;
       int x =0;
       int[] arr = nums.clone();
       int j =arr.length-1;
       Arrays.sort(arr);
     //  Arrays.sort(nums);
       int max = arr[arr.length-1];
       int min= arr[0];
       while(done!=nums.length){
        int diff = max-min;
        x=x+diff;
        max=arr[j-1]+x;
        min=arr[0]+x;
        j--;
        done++;
       }
       return x;
    }
}