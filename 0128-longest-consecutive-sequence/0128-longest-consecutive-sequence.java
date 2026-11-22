class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int maxLength=0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int length=1;
                int next=num+1;
                while(set.contains(next))
                {
                    length++;
                    next++;
                }
                maxLength=Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}