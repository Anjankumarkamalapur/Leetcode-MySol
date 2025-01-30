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
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean righttoleft=true;
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
            if(righttoleft)
            {
                ans.add(lvls);
            }
            else
            {
                List<Integer> temp=new ArrayList<>();
                for(int i=lvls.size()-1;i>=0;i--)
                {
                    temp.add(lvls.get(i));
                }
                ans.add(temp);
            }
            righttoleft=!righttoleft;
        }
        return ans;
    }
}