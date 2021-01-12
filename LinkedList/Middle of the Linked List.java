class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}