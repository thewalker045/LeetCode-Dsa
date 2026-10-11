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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;

        q.add(root);
        int var=0;

        while(!q.isEmpty()){
           List<Integer> list2=new ArrayList<>();
           int size=q.size();

           for(int i=0;i<size;i++){
            TreeNode node= q.poll();
            list2.add(node.val);
            if(node.left!=null)q.offer(node.left);
            if(node.right!=null)q.offer(node.right);
           } 
           if (var%2!=0)
            Collections.reverse(list2);
           list.add(list2);
           var++;
        }
        return list;
    }
}