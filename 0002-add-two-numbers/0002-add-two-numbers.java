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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy=new ListNode();
      ListNode res=dummy;
      int carry=0;
      while(l1!=null || l2!=null || carry==1){
          int sum=carry;
          if(l1!=null){
            sum+=l1.val;
            l1=l1.next;
          }
          if(l2!=null){
            sum+=l2.val;
            l2=l2.next;
          }
          int value=sum%10;
          carry=sum/10;
          dummy.next=new ListNode(value);
         dummy=dummy.next;
      }
      return res.next;

}

}