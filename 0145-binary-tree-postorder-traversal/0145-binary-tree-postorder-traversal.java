class Solution {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer>result=new ArrayList<>();
        traverse(root,result);
        return result;
    }
    private void traverse(TreeNode node,List<Integer>result)
    {
        if(node==null)
        {
            return;
        }
        // Visit left subtree
        traverse(node.left,result);   
        // Visit right subtree
        traverse(node.right,result);  
        // Visit root last
        result.add(node.val);        
    }
}