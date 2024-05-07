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
       ListNode reversed=reverse(head);
        ListNode temp=reversed;
   
        ListNode prev=null;
        int carry=0;
        int x=0;
        while(temp!=null){
             int mul=carry;
             x=temp.val;
            //temp=temp.next;
              
           mul+=x*2;
            temp.val=mul%10;
             carry=mul/10;
             prev=temp;
            temp=temp.next;
        
        }
        if(carry!=0){
            ListNode extra=new ListNode(carry);
            prev.next=extra;
        }
        ListNode res=reverse(reversed);
         
        return res;
    }
    ListNode reverse(ListNode node){
        ListNode curr=node,prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        curr=prev;
        return curr;
    }
}