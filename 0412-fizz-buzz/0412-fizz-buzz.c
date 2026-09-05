/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
char** fizzBuzz(int n, int* returnSize){
    char** answer=malloc(n*sizeof(char*));
    *returnSize=n;
    for (int i=1;i<= n;i++){
        if (i % 15==0){
            answer[i-1]= "FizzBuzz";
        }
        else if (i%3==0){
            answer[i-1] = "Fizz";
        }
        else if (i%5==0) {
            answer[i-1] = "Buzz";
        }
        else{
         char* number = malloc(12*sizeof(char));
            sprintf(number,"%d",i);
            answer[i-1]=number;
        }
    }
return answer;
}