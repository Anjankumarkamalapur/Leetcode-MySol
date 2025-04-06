class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}
class MyLinkedList {
    Node head;
    int len;

    public MyLinkedList() {
        this.head=null;
        this.len=0;
    }
    
    public int get(int index) {
        if(index>=len || head==null || index<0) return -1;
        Node curr=head;
        for(int i=0;i<index;i++)
        {
            curr=curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newnode= new Node(val);
        newnode.next=head;
        head=newnode;
        len++;
    }
    
    public void addAtTail(int val) {
        Node newnode= new Node(val);
        if(head==null) head=newnode;
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
        len++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>len) return;
        if(index==0)
        {
            addAtHead(val);
            return;
        }
        Node newnode= new Node(val);
        Node curr=head;
        for(int i=0;i<index-1;i++)
        {
            curr=curr.next;
        }
        newnode.next=curr.next;
        curr.next=newnode;
        len++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=len) return;
        if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node curr=head;
            for(int i=0;i<index-1;i++)
            {
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        len--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */



//  class MyLinkedList {
//     private static LinkedList<Integer> list ;
//     public MyLinkedList() {
//          list = new LinkedList<>();
//     }
    
//     public int get(int index) {
//         if(index>=list.size()) return -1;
//         return list.get(index);
//     }
    
//     public void addAtHead(int val) {
//         list.addFirst(val);
//     }
    
//     public void addAtTail(int val) {
//         list.addLast(val);
//     }
    
//     public void addAtIndex(int index, int val) {
//         if(index<list.size()) list.add(index,val);
//         else if(index==list.size()) addAtTail(val);
//     }
    
//     public void deleteAtIndex(int index) {
//         if(index<list.size()) list.remove(index);
//     }
// }