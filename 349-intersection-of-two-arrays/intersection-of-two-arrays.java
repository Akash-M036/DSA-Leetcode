class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int a : nums1) s1.add(a);
        for(int a : nums2) s2.add(a);
         ArrayList<Integer> ans = new ArrayList<>();
        for(int a : s2){
            if(s1.contains(a)){
                ans.add(a);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i =0; i< ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // int i =0, j=0;
        // ArrayList<Integer> ans = new ArrayList<>();
        // while(i<nums1.length && j< nums2.length){
        //     if(i!=0 && nums1[i]==nums1[i-1] )
        //         {
        //             i++;
        //             continue;
        //         }
        //     if(j!=0 && nums2[j]==nums2[j-1])
        //     {
        //         j++;
        //         continue;
        //     }
        //     if(nums1[i]<nums2[j]){
        //         i++;
        //     }
        //     else if(nums1[i]>nums2[j]){
        //         j++;
        //     }
        //     else{
        //         ans.add(nums1[i]);
        //         i++;
        //         j++;
        //     }
        // }
        // int[] arr = new int[ans.size()];
        // for(i =0; i< ans.size();i++){
        //     arr[i]=ans.get(i);
        // }
        // return arr;
    }
}