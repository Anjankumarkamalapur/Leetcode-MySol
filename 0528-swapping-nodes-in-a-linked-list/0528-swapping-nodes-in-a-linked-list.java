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
        // First pass: find the length of the list
        int len=0;
        ListNode curr=head;
        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }
        // Second pass: find the kth node from beginning and end
        ListNode firstk=head;
        for(int i=1;i<k;i++)
        {
            firstk=firstk.next;
        }
        ListNode seck=head;
        for(int i=1;i<len-k+1;i++)
        {
            seck=seck.next;
        }
        // Swap the values
        int temp=firstk.val;
        firstk.val=seck.val;
        seck.val=temp;
        return head;
    }
}