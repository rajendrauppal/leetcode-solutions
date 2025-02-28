/*
 * https://leetcode.com/problems/same-tree/description/
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // handle base cases
        // both trees empty
        if (p == null && q == null) return true;
        // one of the tree is empty
        if (p == null || q == null) return false;
        return (p.val == q.val) && // match values
            isSameTree(p.left, q.left) && // match left sub-trees
            isSameTree(p.right, q.right); // match right sub-trees
    }
}
