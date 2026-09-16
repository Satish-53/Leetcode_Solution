class Solution {
    public int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
                       // the element of num1 is to be stored in set
        for (int num:nums1)
        {
            set.add(num);
        }
        HashSet<Integer> result=new HashSet<>();
                  // check  the num2 element 
        for(int num:nums2)
        {
            if(set.contains(num))
            {
                result.add(num);
            }
        }
                           // to convert HashSet into int[] 
        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }
        return ans;
    }
}