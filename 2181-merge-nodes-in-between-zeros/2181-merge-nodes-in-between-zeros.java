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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        boolean first = true;
        int sum = 0;
        head = head.next;

        while(head !=null){
            if(!first && head.val == 0) first = true;
            else if(first && head.val != 0) sum += head.val;
            else if(first && head.val == 0){
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0;
            }
            head = head.next;
        }
        return dummy.next;
    }
}