class Solution {
    public int sumCounts(List<Integer> nums) {
        if(nums.size()==1) return 1;
        int sum=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i< nums.size();i++){
            for(int j =i; j< nums.size();j++){
                set.add(nums.get(j));
                sum += set.size()*set.size();
                System.out.println(set.size()*set.size());
            }
          set = new HashSet<>();
        }
    return sum;
    }
}