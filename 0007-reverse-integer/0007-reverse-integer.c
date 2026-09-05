int reverse(int x){
int reverse=0,reminder;
while(x!=0){
    reminder=x%10;
    if(reverse>214748364 || reverse<-214748364)
    return 0;
    reverse=reverse*10+reminder;
    x=x/10;
}
return reverse;
}