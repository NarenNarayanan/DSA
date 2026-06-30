/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans=null;
    public boolean foundNode(TreeNode root, TreeNode p, TreeNode q){
        if(root==null)return false;
        if(root==p || root==q){ans=root; return true;}
        boolean foundLeft=foundNode(root.left,p,q);
        boolean foundRight=foundNode(root.right,p,q);
        if(foundLeft && foundRight){
            ans=root;
        }
        return foundLeft || foundRight;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        foundNode(root,p,q);
        return ans;
    }
}