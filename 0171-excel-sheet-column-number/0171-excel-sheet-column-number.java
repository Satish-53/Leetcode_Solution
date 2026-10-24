class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        int placeValue=1;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            int letterValue=columnTitle.charAt(i)-'A'+1;
            result +=letterValue*placeValue;
            placeValue*=26;
        }
        return result;
    }
}