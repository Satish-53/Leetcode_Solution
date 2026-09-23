class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums,int indexDiff,int valueDiff){
        if (indexDiff <=0 || valueDiff<0)
        {
            return false;
        }
        long bucketSize=(long) valueDiff+1;
        Map<Long, Long>buckets=new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            long number=nums[i];
            long bucket=Math.floorDiv(number,bucketSize);
            // Same bucket mein numbers ka difference valueDiff ke andar hota hai
            if (buckets.containsKey(bucket))
            {
                return true;
            }
            // Paas wale buckets bhi check karo
            if (buckets.containsKey(bucket-1) && number-buckets.get(bucket-1) <=valueDiff)
            {
                return true;
            }
            if(buckets.containsKey(bucket+1) && buckets.get(bucket+1)-number<=valueDiff)
            {
                return true;
            }
            buckets.put(bucket, number);
            // Window se bahar hua purana number hatao
            if (i>=indexDiff)
            {
                long oldNumber=nums[i-indexDiff];
                long oldBucket=Math.floorDiv(oldNumber,bucketSize);
                buckets.remove(oldBucket);
            }
        }
        return false;
    }
}