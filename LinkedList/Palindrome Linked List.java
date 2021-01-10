class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<Integer>();
        ListNode temp=head;
        while(temp!=null)
        {
            s.push(temp.val);
            temp=temp.next;
        }
        boolean ispalin=true;
        while(head!=null)
        {
            int i=s.pop();
            if(head.val==i)
                ispalin=true;
            else
            {
                ispalin=false;
                break;
            }
            head=head.next;
        }
        return ispalin;
    }
}