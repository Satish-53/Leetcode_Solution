class Solution {
    public void wiggleSort(int[] nums) {
        int[] sorted=nums.clone();
        Arrays.sort(sorted);
        int n=nums.length;
        int mid=(n+1)/2;
        int small=mid-1;
        int large=n-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                nums[i]=sorted[small--];
            }else{
                nums[i]=sorted[large--];
            }
        }
    }
}