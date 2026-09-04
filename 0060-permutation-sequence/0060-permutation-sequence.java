class Solution{
    public String getPermutation(int n,int k){
        StringBuilder numbers=new StringBuilder();
        for(int i = 1; i <= n; i++){
            numbers.append(i);
        }
        StringBuilder ans = new StringBuilder();
        k--;
        int fact=1;
        for (int i=1;i<n;i++){
            fact *=i;
        }
        while(n>0){
            int index=k/fact;
            ans.append(numbers.charAt(index));
            numbers.deleteCharAt(index);
            k=k%fact;
            n--;
            if(n>0){
                fact=fact/n;
            }
        }
        return ans.toString();
    }
}