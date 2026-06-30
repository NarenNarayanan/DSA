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
    public int height(TreeNode root){
        if(root==null)return 0;
        int lh=0,rh=0;
        if(root.left!=null)lh=height(root.left);
        if(root.right!=null)rh=height(root.right);
        return 1+Math.max(lh,rh);
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int h=height(root);
        if(root==null)return null;
        int lh=height(root.left);
        int rh=height(root.right);
        if(lh==h-1 && rh==h-1)return root;
        if(lh>rh)return lcaDeepestLeaves(root.left);
        else return lcaDeepestLeaves(root.right);
    }
}