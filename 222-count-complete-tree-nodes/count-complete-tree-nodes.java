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
    public int help(TreeNode root){
        if(root==null)return 0;
        return 1+help(root.left)+help(root.right);
    }
    public int left(TreeNode root){
        if(root==null)return 0;
        return 1+left(root.left);
    }
    public int right(TreeNode root){
        if(root==null)return 0;
        return 1+right(root.right);
    }
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int l=left(root);
        if(l==right(root))return (1<<l)-1;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}