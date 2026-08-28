class Solution{
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates,target,0,new ArrayList<>(), answer);
        return answer;
    }
    public void findCombination(int[] arr, int target, int start,List<Integer> list,List<List<Integer>> answer){
        if (target == 0){
            answer.add(new ArrayList<>(list));
            return;
        }
        for (int i=start;i<arr.length;i++){
            if (i>start && arr[i]==arr[i-1]){
                continue;
            }
            if (arr[i]>target){
                break;
            }
            list.add(arr[i]);
            findCombination(arr,target - arr[i],i + 1,list,answer);
            list.remove(list.size() - 1);
        }
    }
}
