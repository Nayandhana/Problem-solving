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
    public int maxLevelSum(TreeNode root) {
       Queue<TreeNode>q=new LinkedList<>();
       int max=Integer.MIN_VALUE,level=0,l=0;
       if(root!=null) q.add(root);
       while(!q.isEmpty()){
        int sum=0;
        int size=q.size();
        level++;
        for(int i=0;i<size;i++){
            TreeNode c=q.poll();
            sum+=c.val;
            if(c.left!=null) q.add(c.left);
            if(c.right!=null) q.add(c.right);
        }
        if(sum>max){
            max=sum;
            l=level;
        }
       
       } 
        return l;
    }
}