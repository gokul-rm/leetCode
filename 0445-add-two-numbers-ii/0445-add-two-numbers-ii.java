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
    public ListNode addTwoNumbers(ListNode ll1, ListNode ll2) {

        ListNode lll1 = reverseall(ll1);
        ListNode lll2 = reverseall(ll2);
        ListNode l1 = lll1;
        ListNode l2 = lll2;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return reverseall(dummy.next);
    }

     public ListNode reverseall(ListNode node){
        ListNode prev=null;
        ListNode curr=node;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
}
}