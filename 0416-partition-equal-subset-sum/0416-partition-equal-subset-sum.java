class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for (int num:nums)
        {
            total +=num;
        }
        if (total%2 !=0)
        {
            return false;
        }
        int target=total/2;
        boolean[] Satish=new boolean[target+1];
        Satish[0]=true;
        for (int num:nums)
        {
            for(int sum=target;sum>=num;sum--)
            {
                Satish[sum]=Satish[sum] || Satish[sum-num];
            }
        }
        return Satish[target];
    }
}