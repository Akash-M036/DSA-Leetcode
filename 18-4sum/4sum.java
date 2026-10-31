class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        if(nums.length<4) return ans;
        for(int i =0;i< nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Arrays.sort(nums);
    //    boolean add =false;
         for(int i =0;i< nums.length;i++){
              if (i > 0 && nums[i] == nums[i - 1]) continue;
             int a = nums[i];
             map.put(a,map.get(a)-1);
                 for(int j =i+1;j< nums.length;j++){
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                     int b= nums[j];
                     map.put(b,map.get(b)-1);
                     for(int k =j+1;k< nums.length;k++){
                         if (k > j + 1 && nums[k] == nums[k - 1]) continue;
                        List<Integer> arr=new ArrayList<>();
                        int c = nums[k];
                        long tofindLong = 1L*target-a-b-c;
                        map.put(c,map.get(c)-1);
                        if (tofindLong >= c && tofindLong <= Integer.MAX_VALUE && tofindLong >= Integer.MIN_VALUE) {
                        int tofind = (int) tofindLong;
                        int x = map.getOrDefault(tofind,0);
                        int d=x;
                        if(d!=0){
                            arr.add(a);
                            arr.add(b);
                            arr.add(c);
                            arr.add(tofind);
                           // add =true;
                           ans.add(new ArrayList<>(arr));
                            d--;
                        }
                    }
                        // if(!add)
                         map.put(c,map.get(c)+1);
                }
               map.put(b,map.get(b)+1);

            }
        map.put(a,map.get(a)+1);
        }

        return ans;
    }
}