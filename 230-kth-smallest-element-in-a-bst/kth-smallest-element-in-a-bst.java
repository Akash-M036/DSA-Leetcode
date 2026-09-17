/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
//  */
// class Solution {
//     public void dfs(TreeNode root, int k,PriorityQueue<Integer> pq){
//         if(root==null)
//             return;
//         pq.offer(root.val);
//         if(pq.size()>k)
//             pq.poll();
//         dfs(root.left,k,pq);
//         dfs(root.right,k,pq);
//     }
//     public int kthSmallest(TreeNode root, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         dfs(root,k,pq);
//         return pq.peek();
//     }
// }

class Solution {
   
    int ans =0;
    int cnt =0;
    public void dfs(TreeNode root, int k){
        if(root==null)
            return;
        // pq.offer(root.val);
        dfs(root.left,k);
        cnt++;
        if(cnt==k)
            ans = root.val;
        dfs(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        dfs(root,k);
        return ans;
    }
}