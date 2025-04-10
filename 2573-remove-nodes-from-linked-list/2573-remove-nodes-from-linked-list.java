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
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            while(!st.isEmpty() && st.peek()<temp.val)
            {
                st.pop();
            }
            st.push(temp.val);
            temp=temp.next;
        }
        ListNode ans=null;
        while(!st.isEmpty())
        {
            ListNode newnode=new ListNode(st.pop());
            newnode.next=ans;
            ans=newnode;
        }
        return ans;
    }
}
