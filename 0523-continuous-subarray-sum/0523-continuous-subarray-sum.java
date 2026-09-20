class Solution {
    public boolean checkSubarraySum(int[] nums,int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        //  first we have to store o in index -1 
        map.put(0,-1);
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum +=nums[i];
            int rem=sum % k;
            if (map.containsKey(rem)){
                // we have the length of Subarray is at least 2
                if (i-map.get(rem)>=2){
                    return true;
                }
            }else{
                // if we have to find rweminder at first then we store 
                map.put(rem,i);
            }
        }
        return false;
    }
}