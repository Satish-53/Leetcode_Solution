class Solution {
    public boolean isPalindrome(ListNode head){
        if (head==null || head.next==null)
        {
            return true;
        }
                   // 1. Middle node find karo
        ListNode satish=head;
        ListNode romiyo=head;
        while (romiyo !=null && romiyo.next !=null)
        {
            satish=satish.next;
            romiyo=romiyo.next.next;
        }
        // as we know that the odd lenght list have the perfect middle point
        // so let skip the middle and reverse from the second half.
        if(romiyo !=null)
        {
            satish=satish.next;
        }
                   // now reverse the second half
        ListNode secondHalf=reverse(satish);
        ListNode firstHalf=head;
        // now compare the 1st half and the 2nd half
        while(secondHalf !=null){
            if(firstHalf.val !=secondHalf.val){
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
    }
    private ListNode reverse(ListNode node){
        ListNode previous=null;
        ListNode current=node;
        while(current !=null)
        {
            ListNode nextNode=current.next; // remember the next node
            current.next=previous;       // it pointed to the next node now it point to the previous node
            previous=current;              //  move forward the previous
            current=nextNode;               // move forward the current
        }
        return previous;               // new head of the reversed list
    }
}