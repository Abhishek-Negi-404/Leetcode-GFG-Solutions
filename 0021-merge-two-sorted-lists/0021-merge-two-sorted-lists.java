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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // creating dummy node to keep track of head
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;// initiate curr to dummy

	 // pointers for both linked lists  - initiate to heads
        ListNode p1 = list1;
        ListNode p2 = list2;

	 // move current to traverse the 2 lists and link them together
	 // until p1 or p2 points to null(out of the list)
        while(p1 != null  &&  p2 != null)
        {
            // pointers to save/keep track of the next ListNodes ahead of the p1 & p2
            ListNode np1 = p1.next;
            ListNode np2 = p2.next;

			// moving pointers to required ListNodes
            if(p1.val < p2.val){
                curr.next = p1;
                p1 = np1;
            }else{
                curr.next = p2;
                p2 = np2;
            }
            curr = curr.next;// moving current
        }

	 // joining the remaining elements in the bigger list to current
        if(p1 == null){
            curr.next = p2;
        }else if(p2 == null){
            curr.next = p1;
        }

	 // using dummy to get to head
        ListNode ans = dummy.next;
        return ans;
    }
}