class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0;
        int j=nums.length-1;
        int cnt=0;
        for(i=0;i<=j;){
            //if(i>=j) break;
             if(nums[j]==val){
                j--;
                cnt++;
            }
            else if(j>=0 && nums[i]==val){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
                cnt++;
                i++;
            }
            else i++;
        }
        return nums.length-cnt;
    }
}