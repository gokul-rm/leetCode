import java.math.BigInteger; 
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
        StringBuilder sb = new StringBuilder();
while (head != null) {
    sb.append(head.val);
    head = head.next;
}

BigInteger num = new BigInteger(sb.toString());
num = num.multiply(BigInteger.valueOf(2));

String s = num.toString();

ListNode dummy = new ListNode(0);
ListNode curr = dummy;

for (char c : s.toCharArray()) {
    curr.next = new ListNode(c - '0');
    curr = curr.next;
}

return dummy.next;
    }
}