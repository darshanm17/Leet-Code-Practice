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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==val){
                prev.next=temp.next;

            }
            else{
            prev=temp;}
            temp=temp.next;
            
        }
        return dummy.next;
    }
}