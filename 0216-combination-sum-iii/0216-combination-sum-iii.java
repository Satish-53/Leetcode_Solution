class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>>combinationSum3(int k,int n)
    {
        solve(1,k,n,new ArrayList<>());
        return ans;
    }
    void solve(int start,int k,int n,List<Integer>list)
    {
        if(list.size()==k && n==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        if(list.size()>=k || n<=0)
        {
            return;
        }
        for(int i=start;i<=9;i++)
                {
            list.add(i);
            solve(i+1,k,n-i,list);
            list.remove(list.size()-1);
        }
    }
}
