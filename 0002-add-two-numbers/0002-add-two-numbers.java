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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);// dummy node to keep track of head
        ListNode sum = dummy;
        
        // pointers for traversal
        ListNode p1 = l1;
        ListNode p2 = l2;
        
        int carry = 0;

// Solution 1 =====================================================================================
//         while(p1 != null  &&  p2 != null)// until one list ends
//         {
//             int value = p1.val + p2.val + carry;
//             carry = value/10;
//             ListNode nn = new ListNode(value%10);
//             sum.next = nn;
//             sum = sum.next;
//             p1 = p1.next;
//             p2 = p2.next;
//         }
        
//         // if list1 has leftover Nodes
//         while(p1 != null){
//             int value = p1.val + carry;
//             carry = value/10;
//             ListNode nn = new ListNode(value%10);
//             sum.next = nn;
//             sum = sum.next;
//             p1 = p1.next;
//         }
        
//         // if list2 has leftover Nodes
//         while(p2 != null){
//             int value = p2.val + carry;
//             carry = value/10;
//             ListNode nn = new ListNode(value%10);
//             sum.next = nn;
//             sum = sum.next;
//             p2 = p2.next;
//         }
        
//         // if something is left in carry
//         if(carry > 0){
//             ListNode nn = new ListNode(carry);
//             sum.next = nn;
//         }
        
// Solution 2 ======================================================================================
        // until both lists are traversed and no carry is left
        while(p1 !=null  ||  p2 != null)
        {
            int value = carry;
            if(p1 != null){
                value += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                value += p2.val;
                p2 = p2.next;
            }
            carry = value/10;
            ListNode nn = new ListNode(value%10);
            sum.next = nn;
            sum = sum.next;
        }
        if(carry > 0){
            ListNode nn = new ListNode(carry);
            sum.next = nn;
        }
        
        return dummy.next;// returning head using dummy
    }
}