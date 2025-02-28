/*
 * https://leetcode.com/problems/reverse-linked-list/
 * 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // initialize pointers
        ListNode prev = null;
        ListNode curr = head;

        // iterate through the list
        while (curr != null) {
            // preserve or store the next node
            ListNode next = curr.next;
            // reverse the pointer
            curr.next = prev;
            // move prev and curr one step
            prev = curr;
            curr = next;
        }
        // return new head
        return prev;
    }
}
