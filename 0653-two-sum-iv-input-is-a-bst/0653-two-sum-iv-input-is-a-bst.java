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
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int l=0;
        int h=al.size()-1;
        while(l<h)
        {
            if(al.get(l)+al.get(h)==k) return true;
            else if(al.get(l)+al.get(h)>k) h--;
            else l++;
        }
            return false;
    }
    ArrayList<Integer> al=new ArrayList<>();
    void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
        
    }
}