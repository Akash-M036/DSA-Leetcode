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
    ArrayList<Integer> val = new ArrayList<>();
    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        val.add(root.val);
        dfs(root.right);
    }
    public void change(TreeNode root,int f, int s){
        if(root==null)
        return;
        change(root.left,f,s);
        if(root.val==f)
            root.val =s;
        else if(root.val== s)
            root.val=f;
        change(root.right,f,s);
         }
    public void recoverTree(TreeNode root) {
        dfs(root);
        ArrayList<Integer> sorted  = new ArrayList<>(val);
        Collections.sort(sorted);
        int first =Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        for(int i =0; i< sorted.size();i++){
            if(sorted.get(i)!=val.get(i)){
                if(first==Integer.MIN_VALUE)
                    first = val.get(i);
                else
                    two = val.get(i);
            }
        }
        change(root,first,two);
    }
}