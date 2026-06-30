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
    TreeNode ans=null;
    int maxDepth=0;
    public int height(TreeNode root,int depth){
        if(root==null){
            maxDepth=Math.max(depth,maxDepth);
            return depth;
        }
        int lh=0,rh=0;
        lh=height(root.left,depth+1);
        rh=height(root.right,depth+1);
        if(lh==maxDepth && rh==maxDepth)ans=root;
        return Math.max(lh,rh);
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int h=height(root,0);
        return ans;
    }
}