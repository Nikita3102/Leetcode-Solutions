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
    public int getDecimalValue(ListNode head) {
        head=reverse(head);
        int num=0;
        int base=1;
        while(head!=null)
        {
            num=num+base*head.val;
            base=base*2;
            head=head.next;
        }
        return num;
    }
    
    public ListNode reverse(ListNode head)
    {
        if(head==null||head.next==null)
            return head;
        ListNode prev=null;
        ListNode nextNode=null;
        ListNode current=head;
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