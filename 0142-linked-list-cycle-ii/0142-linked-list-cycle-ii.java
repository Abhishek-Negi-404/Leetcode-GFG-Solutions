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
    public ListNode detectCycle(ListNode head) {
         if(head==null || head.next==null){// base cases
            return null;
        }
        // pointers to traverse
        ListNode slow = head;
        ListNode fast = head;
        // if no. of nodes = even --> fast = null
        // if no, of nodes = odd --> fast.next = null
        while(fast!=null && fast.next!=null)
        {   // moving slow at --> X & fast at --> 2X
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast)//check for cycle
            break;
        }

        if(slow!=fast){//no cycle
            return null;
        }else{
            slow = head;//reset slow back to head
        }
        
        while(slow!=fast){//finding cycle starting point
            slow = slow.next;
            fast = fast.next;
        }
        return slow;// point where cycle begins
    }
}