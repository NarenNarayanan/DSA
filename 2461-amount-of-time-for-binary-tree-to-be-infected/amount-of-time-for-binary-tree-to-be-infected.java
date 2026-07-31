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
    public void buildParent(TreeNode root,TreeNode parent,Map<TreeNode,TreeNode> map){
        if(root==null)return;
        map.put(root,parent);
        buildParent(root.left,root,map);
        buildParent(root.right,root,map);
    }
    public TreeNode where(TreeNode root,int start){
        if(root==null)return null;
        if(root.val==start)return root;
        TreeNode left=where(root.left,start);
        TreeNode right=where(root.right,start);
        return left==null ? right : left;
    }
    public int amountOfTime(TreeNode root, int start) {
        if(root==null)return 0;
        TreeNode target=where(root,start);
        int time=0;
        Map<TreeNode,TreeNode> map=new HashMap<>();
        buildParent(root,null,map);
        Set<TreeNode> visited=new HashSet<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target);
        visited.add(target);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(!visited.contains(node.left) && node.left!=null){
                    q.add(node.left);
                    visited.add(node.left);
                }
                if(!visited.contains(node.right) && node.right!=null){
                    q.add(node.right);
                    visited.add(node.right);
                }
                TreeNode parent=map.get(node);
                if(!visited.contains(parent) && parent!=null){
                    q.add(parent);
                    visited.add(parent);
                }
            }
            time++;
        }
        return time-1;
    }
}