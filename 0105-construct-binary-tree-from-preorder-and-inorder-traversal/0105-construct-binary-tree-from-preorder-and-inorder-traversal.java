class Solution {
    public TreeNode buildTree(int[] preorder,int[] inorder) {
        Map<Integer,Integer>positions=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            positions.put(inorder[i],i);
        }
        return build(preorder,0,0,inorder.length,positions);
    }
    private TreeNode build(
            int[] preorder,
            int preorderStart,
            int inorderStart,
            int length,
            Map<Integer,Integer>positions)
        {
        if(length==0){
            return null;
        }
        int rootValue=preorder[preorderStart];
        int rootPosition=positions.get(rootValue);
        int leftLength=rootPosition-inorderStart;
        TreeNode root=new TreeNode(rootValue);
        root.left=build(
                preorder,
                preorderStart+1,
                inorderStart,
                leftLength,
                positions);
        root.right=build(
                preorder,
                preorderStart+1+leftLength,
                rootPosition+1,
                length-leftLength-1,
                positions);
        return root;
    }
}