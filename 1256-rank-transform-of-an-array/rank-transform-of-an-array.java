class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0 ||arr == null)
            return arr;
        int[] nums = arr.clone();
        Arrays.sort(nums);
        int rank =1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<nums.length-1; i++){
            int curr =rank;
            if(nums[i]<nums[i+1])
                rank++;
            else
                rank =rank;
           map.put( nums[i], curr);
        }
        map.put(nums[arr.length-1],rank);
        for(int i =0; i< arr.length;i++){
            arr[i]= map.get(arr[i]);
        }
        return arr;
    }
}