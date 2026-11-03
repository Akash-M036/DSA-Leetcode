class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i< matrix.length;i++){
            for(int j =0; j<matrix.length;j++){
                //if(pq.size()<k)
                    pq.offer(matrix[i][j]);  
            }
        }
        int topoll = matrix.length * matrix.length-k;
        while(topoll!=0){
            pq.poll();
            topoll--;
        }
        return pq.poll();
    //     int left =0;
    //     int right = matrix.length*matrix.length-1;
    //   //  int total = matrix.length * matrix.length;
    //     while(left<=right){
    //         int mid = (left+right)/2;
    //         int midi = mid/matrix.length;
    //         int midj = mid%matrix.length;
    //         System.out.println(mid);
    //         int curr = (left+right+2)/2;
    //         if(curr==k){
    //            return matrix[midi][midj];
    //         }
    //         if(curr<k){
    //             left = mid+1;
    //         }
    //         else{
    //             right =mid-1;
    //         }
    //     }
    //     return -1;
    }
}