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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd = new ListNode(0);
        ListNode oddptr=odd;
        ListNode even = new ListNode(0);
        ListNode evenptr=even;
        int idx=1;
        while(head!=null)
        {
            if(idx%2==0)
            {
                evenptr.next=head;
                evenptr=evenptr.next;
            }
            else
            {
                oddptr.next=head;
                oddptr=oddptr.next;
            }
            head=head.next;
            idx++;
        }
        evenptr.next=null;
        oddptr.next=even.next;
        return odd.next;
    }
}