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
    public void buildParent(TreeNode root,TreeNode parent,Map<TreeNode,TreeNode> map){
        if(root==null)return;
        map.put(root,parent);
        buildParent(root.left,root,map);
        buildParent(root.right,root,map);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> map=new HashMap<>();
        buildParent(root,null,map);
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        q.offer(target);
        visited.add(target);
        while(!q.isEmpty() && k>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && !visited.contains(curr.left)){
                    q.offer(curr.left);
                    visited.add(curr.left);
                }
                if(curr.right!=null && !visited.contains(curr.right)){
                    q.offer(curr.right);
                    visited.add(curr.right);
                }
                //if(curr.right!=null)q.offer(curr.right);
                if(map.get(curr)!=null && !visited.contains(map.get(curr))){
                    q.offer(map.get(curr));
                    visited.add(map.get(curr));
                }
            }
            k--;
        }
        while(!q.isEmpty()){
            list.add(q.poll().val);
        }
        return list;
    }
}