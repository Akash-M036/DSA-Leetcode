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
    public void delkey(TreeNode root, int key,TreeNode prev){
        if(root.left==null && root.right==null){
            if(prev.val>key){
                prev.left = null;
            }
            else
                prev.right = null;
        }
        if(root.left!=null && root.right==null){
              if(prev.val>key){
                prev.left = root.left;
            }
            else
                prev.right =  root.left;
        }
        if(root.left==null && root.right!=null){
              if(prev.val>key){
                prev.left = root.right;
            }
            else
                prev.right =  root.right;
        }
       
        if(root.left!=null && root.right!=null){
            TreeNode temp = root.right;
            TreeNode tprev = root;
            while(temp.left!=null){
                tprev = temp;
                temp =temp.left;
            }
             if(tprev == root) 
            tprev.right = temp.right;
             else
                tprev.left = temp.right;
             if(prev.val>key){
                prev.left = temp;
                temp.left = root.left;
               // tprev.left =null;
                temp.right = root.right;
            }
            else{
                prev.right =  temp;
                temp.left = root.left;
               // tprev.left = null;
                temp.right = root.right;
            }
        }
        return;
    }
    public void finddel(TreeNode root, int key,TreeNode prev){
        if(root==null)
            return;
        
        if(root.val == key){
            delkey(root,key,prev);
            return;
        }
        if(root.val>key)
            finddel(root.left,key,root);
        else
            finddel(root.right,key,root);
    }
    TreeNode onetime = new TreeNode();
    public void headdel(TreeNode root, int key){
        
        onetime.right =root;
        finddel(root,key,onetime);
        return;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val == key)
            {
                headdel(root,key);
                return onetime.right;
            }
        finddel(root,key,null);
        return root;
    }
}