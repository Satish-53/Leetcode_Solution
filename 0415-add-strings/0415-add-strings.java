class Solution {
    public String addStrings(String num1,String num2){
        StringBuilder result=new StringBuilder();
        int Satish=num1.length()-1;
        int Romiyo=num2.length()-1;
        int carry=0;
        while(Satish>=0 || Romiyo>=0 || carry>0)
        {
            int digit1=0;
            int digit2=0;
            if(Satish>=0)
            {
                digit1=num1.charAt(Satish)-'0';
                Satish--;
            }
            if(Romiyo>=0)
            {
                digit2=num2.charAt(Romiyo)-'0';
                Romiyo--;
            }
            int sum=digit1+digit2+carry;
            result.append(sum%10);
            carry=sum/10;
        }
        return result.reverse().toString();
    }
}