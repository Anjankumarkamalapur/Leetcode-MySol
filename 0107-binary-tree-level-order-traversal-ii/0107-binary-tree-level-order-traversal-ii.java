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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> tempans=new ArrayList<>();
        List<List<Integer>> finalans=new ArrayList<>();
        if(root==null) return tempans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> lvls=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                lvls.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            tempans.add(lvls);
        }
        for(int i=tempans.size()-1;i>=0;i--)
        {
            List<Integer> lol=new ArrayList<>();
            for(int v:tempans.get(i))
            {
                lol.add(v);
            }
            finalans.add(lol);
        }
        return finalans;
    }
}