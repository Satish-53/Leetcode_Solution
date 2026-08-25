class Solution {
    public int[][] insert(int[][] intervals,int[] newInterval){
        List<int[]> ans=new ArrayList<>();
        for (int[] current:intervals){
            if (current[1] < newInterval[0]){
                ans.add(current);
            }
            else if (current[0]>newInterval[1]){
                ans.add(newInterval);
                newInterval=current;
            }
            else{
                newInterval[0]=Math.min(newInterval[0],current[0]);
                newInterval[1]=Math.max(newInterval[1],current[1]);
            }
        }
        ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}