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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null) return false;
        return hasPathSumH(root,0, targetSum);
    }

    public boolean hasPathSumH(TreeNode root, int initial, int target){
        if (root.left==root.right) return target==root.val + initial;
        if (root.left==null) return hasPathSumH(root.right, root.val +initial, target);
        if (root.right==null) return hasPathSumH(root.left, root.val +initial, target);
        return hasPathSumH(root.right, root.val +initial, target) || hasPathSumH(root.left, root.val +initial, target);
    }
}