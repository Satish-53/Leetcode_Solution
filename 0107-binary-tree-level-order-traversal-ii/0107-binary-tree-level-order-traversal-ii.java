class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>levels=new ArrayList<>();
        // Visit every node and group it by depth
        addValues(root,0,levels);
        // The rows were collected top-down; reverse them for bottom-up order
        Collections.reverse(levels);
        return levels;
    }
    private void addValues(TreeNode node,int depth,List<List<Integer>>levels)
    {
        // There is nothing to add for an empty node
        if(node==null)
        return;
        // If this depth has no row yet, create one
        if(depth==levels.size())
        {
            levels.add(new ArrayList<>());
        }
        // Add this node to its row
        levels.get(depth).add(node.val);
        // Visit the left and right children in the next row
        addValues(node.left,depth+1,levels);
        addValues(node.right,depth+1,levels);
    }
}