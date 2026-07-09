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
    public ListNode removeNodes(ListNode head) {
        ListNode rev = reverse(head);
        ListNode res = new ListNode(0);
        ListNode dummy = res;
        int max = Integer.MIN_VALUE;

        while(rev != null){
            if(rev.val >= max){
                max = rev.val;
                dummy.next = rev;
                dummy = dummy.next;
            }
            rev = rev.next;
        }
        dummy.next = null;
        return reverse(res.next);
        
    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
        ListNode Next = head.next;
        head.next = prev;
        prev = head;
        head = Next;
        }
        return prev;
    }
}