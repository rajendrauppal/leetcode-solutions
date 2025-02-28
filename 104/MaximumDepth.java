/*
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 * Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

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
    public int maxDepth(TreeNode root) {
        // handle empty node or empty tree case
        if (root == null) {
            return 0;
        }

        // recursively get depths of left and right sub-trees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // return 1 (current node) plus maximum of left and right depths
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
