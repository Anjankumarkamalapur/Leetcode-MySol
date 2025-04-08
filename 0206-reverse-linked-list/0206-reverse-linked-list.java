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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        Stack<Integer> st= new Stack<>();
        while(temp!=null)
        {
            st.push(temp.val);
            temp=temp.next;
        }
        if(st.isEmpty()) return null;

        ListNode newhead= new ListNode(st.pop());
        ListNode curr=newhead;
        while(!st.isEmpty())
        {
            curr.next=new ListNode(st.pop());
            curr=curr.next;
        }
        return newhead;
    }
}