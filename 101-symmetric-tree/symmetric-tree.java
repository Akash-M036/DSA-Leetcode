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
    public boolean move(TreeNode r1, TreeNode r2){
        if(r1==null && r2== null) return true;
        if(r1==null || r2== null) return false;
        if(r1.val!=r2.val) return false;
        boolean x = move(r1.left,r2.right);
        boolean y = move(r1.right,r2.left);
        return x&y;
    }
    public boolean isSymmetric(TreeNode root) {
            return move(root.left,root.right);
        }
    }
