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
    List<List<Integer>> ans= new ArrayList<>();
    int max =-1;
    public void dfslen(TreeNode root, int h){
        if(root==null) return;
        max= Math.max(max,h);
        dfslen(root.left,h+1);
        dfslen(root.right,h+1);
        return;
    }
    public void dfs(TreeNode root,int h){
        if(root==null) return;
        //max= Math
        ans.get(h).add(root.val);
        dfs(root.left,h+1);
        dfs(root.right,h+1);
        return;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfslen(root,0);
        for(int i=0;i<=max;i++){
            ans.add(new ArrayList<>());
        }
        dfs(root,0);
        return ans;
    }
}