class Solution {
    public int sumNumbers(TreeNode root){
        return sum(root,0);
    }
    private int sum(TreeNode node,int current)
    {
        if(node==null)
        return 0;
        current=current*10+node.val;
        if(node.left==null && node.right==null)
        {
            return current;
        }

        return sum(node.left,current)+sum(node.right,current);
    }
}