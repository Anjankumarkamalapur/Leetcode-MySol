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
        ListNode cur = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while(cur!=null)
        {
            while(cur.next!=null&&cur.val==cur.next.val)
            {
                cur=cur.next;
            }
            if(prev.next==cur)
            {
                prev=cur;
                cur=cur.next;
            }
            else
            {
                prev.next=cur.next;
                cur=prev.next;
            }
        }
        return dummy.next;
    }
}