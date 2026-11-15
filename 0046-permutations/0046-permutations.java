class Solution {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>>ans=new ArrayList<>();
        solve(nums,new ArrayList<>(),ans);
        return ans;
    }
    void solve(int[] nums,List<Integer>list,List<List<Integer>>ans)
    {
        if(list.size()==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int num:nums)
        {
            if(list.contains(num))
            {
                continue;
            }
            list.add(num);
            solve(nums,list,ans);
            list.remove(list.size()-1);
        }
    }
}