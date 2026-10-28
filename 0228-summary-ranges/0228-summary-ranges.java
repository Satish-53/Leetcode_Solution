class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        for(int i=0;i<nums.length;)
        {
            int start=nums[i];
            while(i+1<nums.length && (long) nums[i+1]==(long) nums[i]+1)
            {
                i++;
            }
            int end=nums[i];
            result.add(start==end?String.valueOf(start):start+"->"+end);
            i++;
        }
        return result;
    }
}