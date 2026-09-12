class Solution {
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        int max = head.val;
        ListNode current = head;
        while (current.next != null)
        {
            if (current.next.val < max)
            {
                current.next = current.next.next;
            } 
            else
            {
                max = current.next.val;
                current = current.next;
            }
        }
        return reverse(head);
    }
    public ListNode reverse(ListNode head)
    {
        ListNode previous = null;
        ListNode current = head;
        while (current != null)
        {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}