class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode nextNode=head;
        ListNode current=head;
        ListNode prev=null;
        while(current!=null)
        {
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
    }
}