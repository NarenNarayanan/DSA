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
    int max=0;
    HashMap<Integer,Integer> leftmost;
    public int widthOfBinaryTree(TreeNode root) {
        leftmost=new HashMap<>();
        help(root,0,0);
        return max;
    }
    public void help(TreeNode node,int depth,int position){
        if(node==null)return;
        if (!leftmost.containsKey(depth)) {
            leftmost.put(depth, position);
        }
        max=Math.max(max,position-leftmost.get(depth)+1);
        help(node.left,depth+1,position*2);
        help(node.right,depth+1,position*2+1);
    }
}