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
 */
class Solution {
    int ans =0;
    // int total =0;
    
    public int dfs(TreeNode root,int vary){
        if(root==null)
            return 0;
       // total++;
        if(root.left==null && root.right==null){
             if(vary==1)
                return 1;
            ans++;
            if(vary==0)
            return root.val;
           
        }
        int left1 =0;
        int right1 =0;
        //if(vary==0){
        if(vary==0){
        int sumleft= dfs(root.left,0);
        int sumright=dfs(root.right,0);
        int len = dfs(root,1);
        int a = sumleft+sumright+root.val;
        int b = len;
        if(a/b==root.val) ans++;     
            return a;
        }
        if(vary==1){
         left1 = dfs(root.left,1);
         right1 = dfs(root.right,1);
        }
        return 1+left1+right1;
    }
    public int averageOfSubtree(TreeNode root) {
        dfs(root,0);
        return ans;
    }
}