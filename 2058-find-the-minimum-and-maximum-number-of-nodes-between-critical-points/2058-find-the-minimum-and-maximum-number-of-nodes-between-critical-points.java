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
        ListNode prev = head;
        head = head.next;
        int i = 1, mindist = Integer.MAX_VALUE, prev_i = Integer.MIN_VALUE, first_i = -1;
        while (head.next != null) {
            if ((prev.val < head.val && head.val > head.next.val) || (prev.val > head.val && head.val < head.next.val)) {
                if (prev_i != Integer.MIN_VALUE) {
                    mindist = Math.min(mindist, i - prev_i);
                }
                if (first_i == -1) {
                    first_i = i;
                }
                prev_i = i;
            }
            prev = head;
            head = head.next;
            i++;
        }
        if (mindist == Integer.MAX_VALUE) {
            return new int[] {-1, -1};
        }
        return new int[] {mindist, prev_i - first_i};
    }
}