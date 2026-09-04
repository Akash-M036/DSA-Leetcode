class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0){
            if(nums2.length%2==0)
                return 1.0*(nums2[(nums2.length-1)/2]+nums2[(nums2.length-1)/2+1])/2;
            else
                return 1.0*nums2[(nums2.length-1)/2];
        }
        if(nums2.length==0){
            if(nums1.length%2==0)
                return 1.0*(nums1[(nums1.length-1)/2]+nums1[(nums1.length-1)/2+1])/2;
            else
                return 1.0*nums1[(nums1.length-1)/2];
        }
        int total=nums1.length+nums2.length;
        int medianpos=total/2;
        if(total%2!=0)medianpos=total/2+1;
        int left1=0;
        int left2=0;
        boolean done=false;
        while(left1<nums1.length&&left2<nums2.length){
            if(left1+left2+1==medianpos){
                done=true;
                break;
            }
            if(nums1[left1]<nums2[left2])
                left1++;
            else
                left2++;
        }
        if(!done){
            if(left1==nums1.length){
                left2=medianpos-nums1.length-1;
            }
            else if(left2==nums2.length){
                left1=medianpos-nums2.length-1;
            }
        }
        if(total%2==0){
            double e1,e2;
            if(left1<nums1.length&&(left2>=nums2.length||nums1[left1]<nums2[left2])){
                e1=nums1[left1++];
            }
            else{
                e1=nums2[left2++];
            }
            if(left1<nums1.length&&(left2>=nums2.length||nums1[left1]<nums2[left2])){
                e2=nums1[left1];
            }
            else{
                e2=nums2[left2];
            }
            return(e1+e2)/2.0;
        }
        if(left1==nums1.length)return nums2[left2];
        if(left2==nums2.length)return nums1[left1];
        return Math.min(nums1[left1],nums2[left2]);
    }
}