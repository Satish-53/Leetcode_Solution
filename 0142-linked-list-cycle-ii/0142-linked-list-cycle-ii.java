public class Solution {
    public ListNode detectCycle(ListNode head)
    {
        ListNode meetingPoint=findMeetingPoint(head);
        if(meetingPoint==null)
        {
            return null;
        }
        ListNode cycleStart=head;
        while(cycleStart !=meetingPoint)
        {
            cycleStart=cycleStart.next;
            meetingPoint=meetingPoint.next;
        }
        return cycleStart;
    }
    private ListNode findMeetingPoint(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast !=null && fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return slow;
            }
        }
        return null;
    }
}