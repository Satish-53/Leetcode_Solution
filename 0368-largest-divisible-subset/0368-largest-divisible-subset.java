class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        int max = 1;
        int lastIndex = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i])
                {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if(dp[i] > max)
            {
                max = dp[i];
                lastIndex = i;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(lastIndex != -1) {
            ans.add(nums[lastIndex]);
            lastIndex = prev[lastIndex];
        }

        return ans;
    }
}
