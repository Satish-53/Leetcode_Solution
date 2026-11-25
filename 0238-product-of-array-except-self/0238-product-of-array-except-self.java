class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int prefix=1;
        // Left to Right
        for(int i=0;i<n;i++)
        {
            ans[i]=prefix;
            prefix=prefix*nums[i];
        }
        int suffix=1;
        // Right to Left
        for(int i=n-1;i>=0;i--)
        {
            ans[i]=ans[i]*suffix;
            suffix=suffix*nums[i];
        }
        return ans;
    }
}