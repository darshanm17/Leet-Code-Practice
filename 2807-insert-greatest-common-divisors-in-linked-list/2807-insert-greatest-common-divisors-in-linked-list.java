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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       ListNode temp=head;
       ListNode prev=head;
       if(head==null||head.next==null){
        return head;
       }
       while(temp!=null && temp.next!=null){
        prev=temp;
        if(temp.next!=null)
        temp=temp.next;
        int x=prev.val,y=temp.val;
        int ans=greatestCMD(x,y);
        ListNode newNode=new ListNode(ans);
        prev.next=newNode;
        newNode.next=temp;

       }
       return head;

    }
    private int greatestCMD(int a,int b){
        int x=Math.min(a,b);
        for(int i=x;i>1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
}