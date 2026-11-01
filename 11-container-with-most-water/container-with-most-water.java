class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int ans=0;
        int j =height.length-1;
        while(i<=j){
            int x =Math.min(height[i],height[j]);
            ans = Math.max(ans,x*(j-i));
            if(height[i]<height[j]){
                i++;
            }
            else
                j--;
        }
        return ans;
    }
}