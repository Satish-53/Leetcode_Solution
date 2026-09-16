class Solution {
    public int findKthLargest(int[] nums,int k) {
                // Let first short the Array
        Arrays.sort(nums);
                // now return the Kth largest element
        return nums[nums.length-k];
    }
}