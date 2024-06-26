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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null)
        return head;
        ListNode templeft=head;
        for(int i=0;i<k-1;i++){
            templeft=templeft.next;
        }
        int n=size(head);
        ListNode tempright=head;
        for(int i=0;i<n-k;i++){
                tempright=tempright.next;
        }
        if(templeft==tempright)
        return head;
        templeft.val=templeft.val+tempright.val;
        tempright.val=templeft.val-tempright.val;
        templeft.val=templeft.val-tempright.val;
        return head;

    }
    private int size(ListNode temp){
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
}