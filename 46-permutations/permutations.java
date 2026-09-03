class Solution {
    public void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }
    public void reverse(int i , int j , int[] nums){
        while(i<j){
            swap(i,j,nums);
            i++;
            j--;
        }
    }
    public void nextpm(int[] nums){
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        int j =nums.length-1;
        if(i>=0){
        while(j>=0 && nums[j]<=nums[i])
            j--;
        swap(i,j,nums);
        }
        reverse(i+1,nums.length-1,nums);
    }
    public int fact(int n){
        if(n==0 ||n==1)
            return 1;
        return fact(n-1)*n;
    }
    public void addnext(int cnt,List<List<Integer>> ans,int[] nums){
        if(cnt==0) return;
        List<Integer> sub = new ArrayList<>();
        for(int i = 0; i< nums.length;i++){
            sub.add(nums[i]);
        }
        ans.add(sub);
        nextpm(nums);
        addnext(cnt-1,ans,nums);
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int cnt = fact(nums.length);
        addnext(cnt,ans,nums);
        return ans;
    }
}