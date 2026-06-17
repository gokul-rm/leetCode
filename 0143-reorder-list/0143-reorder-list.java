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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;            
        }
        ListNode secondHalf = slow.next;
        slow.next = null;

        ListNode prev =  null;
        ListNode curr = secondHalf;

        while(curr != null){
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }


        ListNode first = head;
        ListNode secondHead = prev;
        
        while (first != null && secondHead != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = secondHead.next;
            
            first.next = secondHead;
            secondHead.next = temp1;
            
            first = temp1;
            secondHead = temp2;
        }
    }
}