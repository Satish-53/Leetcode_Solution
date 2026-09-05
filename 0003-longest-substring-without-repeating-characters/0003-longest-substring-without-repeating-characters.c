int lengthOfLongestSubstring(char* s) {
    int i,j,max=0;
    for(i=0;s[i]!='\0';i++){
        int visited[256]={0};
        int count=0;
        for(j=i;s[j]!='\0';j++){
            if(visited[(unsigned char)s[j]])
            break;
            visited[(unsigned char)s[j]]=1;
            count++;
        }
        if(count>max)
        max=count;
    }
    return max;
}