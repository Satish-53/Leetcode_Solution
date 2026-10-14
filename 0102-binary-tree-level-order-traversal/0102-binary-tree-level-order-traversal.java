class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>satish=new ArrayList<>();
        if(root==null)
        return satish;
        Queue<TreeNode>queue=new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelSize=queue.size();
            List<Integer>level=new ArrayList<>();
            for (int i=0;i<levelSize;i++)
            {
                TreeNode node=queue.poll();
                level.add(node.val);
                if(node.left !=null)
                queue.offer(node.left);
                if(node.right !=null)
                queue.offer(node.right);
            }
            satish.add(level);
        }
        return satish;
    }
}