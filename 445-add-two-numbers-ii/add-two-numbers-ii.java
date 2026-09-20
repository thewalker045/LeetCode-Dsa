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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }

        BigInteger n1 = new BigInteger(s1.toString());
        BigInteger n2 = new BigInteger(s2.toString());

        BigInteger sum = n1.add(n2);

        String s = sum.toString();

        ListNode head = null;
        ListNode temp = null;

        for (int i = 0; i < s.length(); i++) {
            ListNode node = new ListNode(s.charAt(i) - '0');

            if (head == null) {
                head = node;
                temp = node;
            } else {
                temp.next = node;
                temp = node;
            }
        }

        return head;
    }
}