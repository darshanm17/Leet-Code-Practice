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
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)
        return head;
        ListNode dummy=new ListNode(0);
        ListNode cur=head;
        ListNode pre=dummy,next=null;
       
        while(cur!=null){
            next=cur.next;
            while(pre.next!=null && pre.next.val <cur.val){
                pre=pre.next;
            }
            cur.next=pre.next;
            pre.next=cur;
            pre=dummy;
            cur=next;
            
        }
        return dummy.next;

    }
}