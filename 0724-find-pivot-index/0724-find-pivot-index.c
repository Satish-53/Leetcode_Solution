int pivotIndex(int* nums, int numsSize){
    int total = 0;
    int leftSum = 0;
    for (int i = 0; i < numsSize; i++){
        total += nums[i];
    }
    for (int i = 0; i < numsSize; i++){
        int rightSum = total - leftSum - nums[i];
        if (leftSum == rightSum){
            return i;
        }
        leftSum += nums[i];
    }
    return -1;
}