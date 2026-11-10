class Solution {
    private ListNode current;
    public TreeNode sortedListToBST(ListNode head)
    {
        int size=0;
        for(ListNode node=head;node !=null;node=node.next)
        {
            size++;
        }
        current=head;
        return buildTree(size);
    }
    private TreeNode buildTree(int size)
    {
        if(size<=0)
        {
            return null;
        }
        // Build the left subtree first.
        TreeNode left=buildTree(size/2);
        // The current list node becomes the root.
        TreeNode root=new TreeNode(current.val);
        root.left=left;
        current=current.next;
        root.right=buildTree(size-size/2-1);
        return root;
    }
}