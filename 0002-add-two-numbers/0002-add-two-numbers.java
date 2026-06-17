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
        ListNode dummy = new ListNode(0);
        ListNode dum = dummy;
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            dum.next = new ListNode(sum %10);
            dum = dum.next;
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.val + carry;
            dum.next = new ListNode(sum%10);
            dum = dum.next;
            carry = sum / 10;
            l1 = l1.next;
        }
        while(l2 != null){
            int sum = l2.val + carry;
            dum.next = new ListNode(sum%10);
            dum = dum.next;
            carry = sum / 10;
            l2 = l2.next;
        }

        if(carry == 1) dum.next = new ListNode(1);
        return dummy.next;
    }
}