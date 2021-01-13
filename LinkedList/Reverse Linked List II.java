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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null)
            return null;
        int count=1;
        ListNode current=head;
        ListNode prev=null;
        while(count<m && current!=null)
        {
            prev=current;
            current=current.next;
            count++;
        }
        ListNode nextNode=null;
        ListNode connection=prev;
        ListNode tail=current;
        while(count<=n)
        {
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
            count++;
        }
        if(connection!=null)
            connection.next=prev;
        else
            head=prev;
        tail.next=current;
        return head;
    }
}