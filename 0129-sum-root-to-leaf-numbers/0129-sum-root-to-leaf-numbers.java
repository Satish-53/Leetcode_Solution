class Solution {
    public int sumNumbers(TreeNode root) {
        if(root==null)
        return 0;
        int total=0;
        Deque<Pair>stack=new ArrayDeque<>();
        stack.push(new Pair(root,0));
        while(!stack.isEmpty())
        {
            Pair item=stack.pop();
            TreeNode node=item.node;
            int number=item.number*10+node.val;
            if(node.left==null && node.right==null)
            {
                total +=number;
            }
            else
            {
                if(node.right !=null)
                stack.push(new Pair(node.right,number));
                if(node.left !=null)
                stack.push(new Pair(node.left,number));
            }
        }
        return total;
    }
    private static class Pair
    {
        TreeNode node;
        int number;
        Pair(TreeNode node,int number)
        {
            this.node=node;
            this.number=number;
        }
    }
}