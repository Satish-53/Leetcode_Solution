int getValue(char c){
   switch(c){
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
}
int romanToInt(char *s){
    int sum = 0;
    int i = 0;
    while(s[i] != '\0'){
        if(getValue(s[i]) < getValue(s[i + 1])){
            sum = sum - getValue(s[i]);
        }
        else{
            sum = sum + getValue(s[i]);
        }
        i++;
    }
    return sum;
}