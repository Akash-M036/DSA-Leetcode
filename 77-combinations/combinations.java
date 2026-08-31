class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void create(int j,int n ,int k,ArrayList<Integer> arr){
        arr.add(j);
        if(arr.size()==k){
            ans.add(new ArrayList<>(arr));
            arr.remove(arr.size()-1);
            return;
        }
        for(int i =j+1; i<=n;i++){
            create(i,n,k,arr);
        }
        arr.remove(arr.size()-1);
        return;
    }
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=n;i++){
            create(i,n,k,arr);
        }
         return ans;
    }
}