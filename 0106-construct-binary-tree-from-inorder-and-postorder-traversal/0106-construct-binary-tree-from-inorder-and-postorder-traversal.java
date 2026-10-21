class Solution {
    private int postorderIndex;
    private Map<Integer,Integer>inorderPositions;
    public TreeNode buildTree(int[] inorder,int[] postorder)
    {
        postorderIndex=postorder.length-1;
        inorderPositions=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            inorderPositions.put(inorder[i],i);
        }
        return build(inorder,postorder,0,inorder.length-1);
    }
    private TreeNode build(
        int[] inorder,
        int[] postorder,
        int left,
        int right)
        {
            if(left>right)
            {
                return null;
            }
            int value=postorder[postorderIndex--];
            TreeNode root=new TreeNode(value);
            int middle=inorderPositions.get(value);
            // Build right first because we read postorder from the end
            root.right=build(inorder,postorder,middle+1,right);
            root.left=build(inorder,postorder,left,middle-1);
            return root;
        }
}