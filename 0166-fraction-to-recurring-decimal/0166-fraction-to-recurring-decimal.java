class Solution {
    public String fractionToDecimal(int numerator,int denominator)
    {
        if(numerator==0)
        return "0";
        long n=numerator,d=denominator;
        StringBuilder ans=new StringBuilder();
        if((n<0) !=(d<0))
        ans.append("-");
        n=Math.abs(n);
        d=Math.abs(d);
        ans.append(n/d);
        long rem=n%d;
        if(rem==0)
        return ans.toString();
        ans.append(".");
        Map<Long,Integer>seen=new HashMap<>();
        while(rem !=0)
        {
            if(seen.containsKey(rem))
            {
                ans.insert(seen.get(rem),"(");
                ans.append(")");
                break;
            }
            seen.put(rem,ans.length());
            rem *=10;
            ans.append(rem/d);
            rem %=d;
        }
        return ans.toString();
    }
}