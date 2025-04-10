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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        if(len==n) return head.next;
        int remnode=len-n;
        ListNode curr=head;
        for(int i=1;i<remnode;i++)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}