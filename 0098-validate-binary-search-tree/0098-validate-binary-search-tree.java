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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        long min=Long.MIN_VALUE;
        long max=Long.MAX_VALUE;
        return fun(root,min,max);
    }
    public static boolean fun(TreeNode root,long min,long max)
    {
        if(root==null) return true;
        if(root.val<=min || root.val>=max) return false;
        return fun(root.left,min,root.val) && fun(root.right,root.val,max);
    }
}
