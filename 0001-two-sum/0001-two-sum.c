int* twoSum(int* arr, int size, int target, int* returnSize) {
    static int ans[2];
    *returnSize = 2;

    for(int x=0;x<size;x++){
        for(int y=x+1;y<size;y++){
            int sum=arr[x]+arr[y];
            if(sum==target){
                ans[0]=x;
                ans[1]=y;
                return ans;
            }
        }
    }
    return ans;
}