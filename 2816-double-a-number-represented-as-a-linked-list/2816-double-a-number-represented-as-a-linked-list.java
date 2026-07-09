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
    public ListNode doubleIt(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        boolean addDummy = false;

        for (ListNode curr = head; curr != null; curr = curr.next) {

            int num = curr.val * 2;

            if (num >= 10) {
                if (prev == dummy) {
                    addDummy = true;
                }
                prev.val++;
            }

            curr.val = num % 10;
            prev = curr;
        }

        if (addDummy) {
            return dummy;
        }

        return head;
    }
}