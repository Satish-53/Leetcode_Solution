class Solution{
    public ListNode rotateRight(ListNode head,int k){
        if (head==null || head.next==null){
            return head;
        }
        int length=0;
        ListNode temp=head;
        while (temp !=null){
            length++;
            temp=temp.next;
        }
        k=k%length;
        if(k==0){
            return head;
        }
        temp=head;
        while (temp.next !=null){
            temp=temp.next;
        }
        temp.next=head;
        int steps=length-k;
        temp=head;
        for (int i=1;i<steps;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}