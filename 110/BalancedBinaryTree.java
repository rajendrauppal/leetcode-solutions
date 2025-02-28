/*
 * https://leetcode.com/problems/balanced-binary-tree/description/
 * Given a binary tree, determine if it is height-balanced.
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
    private boolean isBalanced = true;
    private int checkHeight(TreeNode node) {
        // if we have hit the leaf node, start returning upward the tree
        if (node == null) return 0;

        // find height of the left subtree
        int leftHeight = checkHeight(node.left);

        // find height of the right subtree
        int rightHeight = checkHeight(node.right);

        // if height unbalanced, then set the status to false
        if (Math.abs(leftHeight - rightHeight) > 1)
            isBalanced = false;

        // height of the tree rooted at node would be current height (1) plus maximum
        // of left and right height of the left and right subtrees
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public boolean isBalanced(TreeNode root) {
        checkHeight(root);
        return isBalanced;
    }
}
