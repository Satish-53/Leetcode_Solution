class Solution {
    public int findUnsortedSubarray(int[] nums)
    {
        int s=nums.length;
        int left=s;
        int right=0;
        int maxSeen=Integer.MIN_VALUE;
        for(int i=0;i<s;i++)
        {
            maxSeen=Math.max(maxSeen,nums[i]);
            if(nums[i]<maxSeen)
            {
                right=i;
            }
        }
        int minSeen=Integer.MAX_VALUE;
        for(int i=s-1;i>=0;i--){
            minSeen=Math.min(minSeen,nums[i]);
            if(nums[i]>minSeen){
                left=i;
            }
        }
        return right>left ? right-left+1:0;
    }
}