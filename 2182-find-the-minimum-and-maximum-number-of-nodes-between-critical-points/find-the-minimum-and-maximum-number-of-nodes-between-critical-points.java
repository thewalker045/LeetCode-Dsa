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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head.next == null)
            return new int[] { -1, -1 };
        if (head.next.next == null)
            return new int[] { -1, -1 };
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[2];

        ListNode prev = head;
        ListNode curr = head.next;
        int counter = 2;
        while (curr.next != null) {
            if (prev.val < curr.val && curr.val > curr.next.val)
                list.add(counter);
            if (prev.val > curr.val && curr.val < curr.next.val)
                list.add(counter);
            counter++;
            prev = curr;
            curr = curr.next;

        }

        if(list.size()<2) return new int[]{-1,-1};

        int max = list.get(0);
        int min = list.get(0);

        for (int num : list) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        arr[1] = Math.abs(max - min);

        int minDiff = Integer.MAX_VALUE;
        ;

        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, Math.abs(list.get(i) - list.get(i - 1)));
        }
        arr[0] = minDiff;

        return arr;

    }
}