class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left =0;
        int high = matrix[0].length * matrix.length -1;
        while(left<=high){
            int mid = left+(high-left)/2;
            int r = mid/matrix[0].length;
            int c = mid%(matrix[0].length);
            if(matrix[r][c]==target)
                return true;
            if(matrix[r][c]<target){
                
                left =mid+1;
            }
            else
            high=mid-1;
        }
        return false;
    }
}