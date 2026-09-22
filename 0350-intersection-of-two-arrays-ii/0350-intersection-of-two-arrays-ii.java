class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
             // frequency count for nums1 element
        for (int num:nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>();
              // frequency count for nums2 element
        for (int num:nums2)
        {
            if (map.getOrDefault(num,0)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        // for ArrayList->int[]
        int[] result=new int[list.size()];
        for (int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
