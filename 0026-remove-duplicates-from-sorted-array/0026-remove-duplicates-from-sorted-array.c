int removeDuplicates(int* nums, int numsSize) {
    if (numsSize==0)
    return 0;
    int j=0;
    for(int i=1;i<numsSize;i++){
        if(nums[i]!=nums[j]){
            j++;
            nums[j]=nums[i];
        }
    }
    return j+1;
}