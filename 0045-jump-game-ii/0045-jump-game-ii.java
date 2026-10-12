class Solution 
{
    public int jump(int[] nums)
    {
        int jumps=0;
        int currentEnd=0;
        int maxReachableIndex=0;
        for (int i=0;i<nums.length-1;i++)
        {
            maxReachableIndex=Math.max(maxReachableIndex,i+nums[i]);
            if(i==currentEnd)
            {
                jumps++;
                currentEnd=maxReachableIndex;
            }
        }
        return jumps;
    }
}