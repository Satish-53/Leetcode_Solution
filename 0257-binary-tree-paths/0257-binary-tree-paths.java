class Solution {
    public void solve(TreeNode root, String path, List<String> ans) {     
        if (root==null)
        {
            return;
        }
        path +=root.val;
        // If leaf node
        if (root.left==null && root.right==null)
        {
            ans.add(path);
            return;
        }
        path +="->";
        solve(root.left,path,ans);
        solve(root.right,path,ans);
    }
    public List<String> binaryTreePaths(TreeNode root)
    {
        List<String> ans=new ArrayList<>();
        solve(root,"",ans);
        return ans;
    }
}