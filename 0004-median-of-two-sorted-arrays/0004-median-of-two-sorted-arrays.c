double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
     int a[2000], i, j, k = 0, t;

    for(i = 0; i < nums1Size; i++) a[k++] = nums1[i];
    for(i = 0; i < nums2Size; i++) a[k++] = nums2[i];

    for(i = 0; i < k - 1; i++)
        for(j = i + 1; j < k; j++)
            if(a[i] > a[j]) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }

    if(k % 2==0)
        return (a[k / 2-1]+a[k/2])/2.0;
    else
        return a[k/2];
}