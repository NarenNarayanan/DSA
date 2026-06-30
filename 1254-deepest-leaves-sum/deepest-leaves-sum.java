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
    //int sum=0;
    public int s(TreeNode root,int cnt,int h){
        int sum=0;
        if(root==null)return 0;
        cnt++;
        if(cnt==h)sum+=root.val;
        if(root.left!=null)sum+=s(root.left,cnt,h);
        if(root.right!=null)sum+=s(root.right,cnt,h);
        return sum;
    }
    public int deepestLeavesSum(TreeNode root) {
        int h=height(root);
        int cnt=0;
        int sum=s(root,cnt,h);
        return sum;
    }
}