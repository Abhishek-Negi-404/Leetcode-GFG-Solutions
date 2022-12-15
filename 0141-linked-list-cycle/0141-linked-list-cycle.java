/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){// base cases
            return false;
        }
        // making two pointers slow and fast to traverse
        ListNode slow = head;
        ListNode fast = head;
        // if no. of nodes = even --> fast = null
        // if no, of nodes = odd --> fast.next = null
        while(fast!=null && fast.next!=null)
        {   // moving slow at --> X & fast at --> 2X
            slow = slow.next;
            fast = fast.next.next;
            // is the pointers meet ==> cyclic
            if(slow==fast)
            return true;
        }
        return false;
    }
}