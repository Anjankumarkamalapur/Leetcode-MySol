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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> ls= new ArrayList<>();
        for(ListNode l:lists)
        {
            ListNode temp=l;
            while(temp!=null)
            {
                ls.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode ans= new ListNode(0);
        ListNode curr=ans;
        Collections.sort(ls);
        for(int i:ls)
        {
            ListNode t=new ListNode(i);
            curr.next=t;
            curr=curr.next;
        }
        return ans.next;
    }
}