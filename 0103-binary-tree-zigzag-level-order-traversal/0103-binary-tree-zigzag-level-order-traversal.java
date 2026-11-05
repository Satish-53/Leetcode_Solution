class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>answer=new ArrayList<>();
        if(root==null)
        return answer;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean leftToRight=true;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer>row=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                row.add(node.val);
                if(node.left !=null)
                queue.offer(node.left);
                if(node.right !=null)
                queue.offer(node.right);
            }
            if(!leftToRight)
            {
                Collections.reverse(row);
            }
            answer.add(row);
            leftToRight=!leftToRight;
        }
        return answer;
    }
}