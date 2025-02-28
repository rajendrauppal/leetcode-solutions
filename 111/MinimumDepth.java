/*
 * https://leetcode.com/problems/minimum-depth-of-binary-tree
 * 
 * Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.
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
    public int minDepth(TreeNode root) {
        // empty tree has zero depth
        if (root == null) return 0;
        
        // only root node, return depth as 1
        if (root.left == null && root.right == null) return 1;

        // if left node is empty, recurse and find min depth to the right
        if (root.left == null) return 1 + minDepth(root.right);

        // if right node is empty, recurse and find min depth to the left
        if (root.right == null) return 1 + minDepth(root.left);

        // if both left and right subtrees exist, find minimum of both
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
