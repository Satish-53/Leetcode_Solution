class Solution {
    public int majorityElement(int[] nums) {
        int satish=0;
        int romiyo=0;
        for(int num:nums)
        {
            if(romiyo==0)
            {
                satish=num;
            }
            if(num==satish)
            {
                romiyo=romiyo+1;
            }else
            {
                romiyo=romiyo-1;
            }
        }
        return satish;
    }
}