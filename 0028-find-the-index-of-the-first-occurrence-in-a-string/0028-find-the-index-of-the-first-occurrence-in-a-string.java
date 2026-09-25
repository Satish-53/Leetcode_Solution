class Solution {
    public int strStr(String haystack, String needle){
        int Satish=haystack.length();
        int Romiyo=needle.length();
        if(Romiyo==0)
        return 0;
        for(int i=0;i<=Satish-Romiyo;i++)
        {
            int j=0;
            while(j<Romiyo && haystack.charAt(i+j)==needle.charAt(j))
            {
                j++;
            }
            if(j==Romiyo)
            return i;
        }
        return -1;
    }
}