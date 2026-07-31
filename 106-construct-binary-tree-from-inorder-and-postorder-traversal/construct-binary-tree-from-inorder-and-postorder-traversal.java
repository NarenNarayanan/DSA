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
    public TreeNode help(int[] inorder,int[] postorder,int inStart,int inEnd,int pStart,int pEnd){
        if(inEnd<inStart || pEnd<pStart)return null;
        TreeNode curr=new TreeNode(postorder[pEnd]);
        int i=0;
        for(i=inStart;i<inorder.length;i++){
            if(inorder[i]==postorder[pEnd])break;
        }
        int leftSize=i-inStart;

        curr.left=help(inorder,postorder,inStart,i-1,pStart,pStart+leftSize-1);
        curr.right=help(inorder,postorder,i+1,inEnd,pStart+leftSize,pEnd-1);
        return curr;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return help(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
}