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
        // prev-Node to change the links to previous Nodes
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            // storing next Node
            ListNode nextOfCurr = curr.next;
            curr.next = prev;// reversing links
            prev = curr;
            curr = nextOfCurr;// moving to next
        }
        // prev will be at the end Node
        head = prev;
        return head;
    }
}