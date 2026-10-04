class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        boolean[] seen=new boolean[n+1];
        int duplicate=0;
        int missing=0;
        for(int num:nums)
        {
           if(seen[num])
           {
            duplicate=num;
           }
            seen[num]=true;
        }
        for(int i=1;i<=n;i++)
        {
            if(!seen[i])
            {
                missing=i;
                break;
            }
        }
        return new int[]{duplicate,missing};
    }
}