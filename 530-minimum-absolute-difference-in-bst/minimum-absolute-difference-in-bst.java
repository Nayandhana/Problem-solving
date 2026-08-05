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
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int min=Integer.MAX_VALUE;
      List<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
              int size=q.size();
            for(int i=0;i<size;i++){
            TreeNode c=q.poll();
            list.add(c.val);
            if(c.left!=null){
                //list.add(c.left.val);
                q.add(c.left);
            }
            if(c.right!=null){
                //list.add(c.right.val);
                q.add(c.right);
            }
            }
        }
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                min=Math.min(Math.abs(list.get(i)-list.get(j)),min);
            }
        }
        return min;
    }
}