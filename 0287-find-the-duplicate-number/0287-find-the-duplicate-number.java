class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        // find a meeting point inside the cycle
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while(slow !=fast);
        // find the cycle entrance which is the duplicate number
        slow=nums[0];
        while(slow !=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}