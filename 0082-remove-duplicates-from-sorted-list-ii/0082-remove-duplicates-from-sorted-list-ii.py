class Solution:
    def deleteDuplicates(self, head):
        dummy=ListNode(0)
        dummy.next=head
        prev=dummy
        while head:
            if head.next and head.val==head.next.val:
                value=head.val
                while head and head.val==value:
                    head=head.next
                prev.next=head
            else:
                prev =head
                head =head.next
        return dummy.next