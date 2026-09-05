/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize){
    int *ans = (int*)malloc(numsSize * sizeof(int));
    *returnSize = 0;
    for (int i = 0; i < numsSize; i++) {
        int index = abs(nums[i]) - 1;
        if (nums[index] > 0){
            nums[index] = -nums[index];
        }
    }
       for (int i = 0; i < numsSize; i++){
        if (nums[i] > 0){
            ans[*returnSize] = i + 1;
            (*returnSize)++;
        }
    }
    return ans;
}