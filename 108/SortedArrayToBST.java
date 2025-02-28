/*
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 *
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
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
    private TreeNode buildBST(int[] nums, int left, int right) {
        // return if we have traversed the whole input array
        if (left > right) {
            return null;
        }
        // find middle element because that would be root of current numbers window
        int mid = left + (right - left) / 2;
        
        // create a new node with this middle element
        TreeNode root = new TreeNode(nums[mid]);
        
        // recurse to build left sub-BST
        root.left = buildBST(nums, left, mid - 1);
        
        // recurse to build right sub-BST
        root.right = buildBST(nums, mid + 1, right);
        
        // return from the deepest recursion stack
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return buildBST(nums, 0, nums.length - 1);
    }
}
