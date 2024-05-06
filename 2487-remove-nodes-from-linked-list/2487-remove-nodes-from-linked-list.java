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
   ListNode curr=head;
   ListNode prev=null;
   while(curr!=null){
    ListNode temp=curr.next;
    curr.next=prev;
    prev=curr;
    curr=temp;
   }
   curr=prev.next;
   prev.next=null;
   while(curr!=null){
    ListNode temp=curr.next;
    if(curr.val>=prev.val){
        curr.next=prev;
        prev=curr;
    }
    curr=temp;
   }
     return prev;
    }
   
    }
        /*    ListNode temp=head;
      ListNode prev=head;
      
      while(temp!=null && temp.next!=null){
        prev=temp;
        temp=temp.next;
        if(temp.val>head.val){
            prev.next=temp.next;
            temp=prev;
        }
      }
      return head;*/