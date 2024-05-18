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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode dummy=new ListNode(-1);
       dummy.next=head;
       ListNode t=dummy;
       while(head!=null){
        if(head.next!=null && head.val==head.next.val){
            while(head.next!=null && head.val==head.next.val){
                head=head.next;
            }
            t.next=head.next;

        }else{
            t=t.next;
        }
        head=head.next;

       }
       return dummy.next;

    }
}