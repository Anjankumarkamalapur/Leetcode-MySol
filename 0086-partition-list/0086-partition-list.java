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
    public ListNode partition(ListNode head, int x) {
        List<Integer> less=new ArrayList<>();
        List<Integer> high=new ArrayList<>();
        ListNode dummy=head;
        while(dummy!=null)
        {
            if(dummy.val<x) less.add(dummy.val);
            else high.add(dummy.val);
            dummy=dummy.next;
        }
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        for(int val:less)
        {
            temp.next=new ListNode(val);
            temp=temp.next;
        }
        for(int val:high)
        {
            temp.next=new ListNode(val);
            temp=temp.next;
        }
        return ans.next;
    }
}