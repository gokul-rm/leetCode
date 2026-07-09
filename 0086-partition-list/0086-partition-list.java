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
    public ListNode partition(ListNode head, int x) {
        ListNode dummyRight = new ListNode(0);
        ListNode dummyLeft = new ListNode(0);
        ListNode right = dummyRight;
        ListNode left = dummyLeft;

        while(head!=null){
            if(head.val >= x){
                right.next = head;
                right = right.next;
            }
            else{
                left.next = head;
                left = left.next;
            }
            head = head.next;
        }
        right.next = null;
        left.next = dummyRight.next;
        return dummyLeft.next;
    }
}