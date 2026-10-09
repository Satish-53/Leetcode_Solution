class Solution {
    public boolean isMatch(String s, String p) {
        int x=s.length();
        int y=p.length();
        boolean[][] dp=new boolean[x+1][y+1];
        dp[0][0]=true;
        for(int j=2;j<=y;j++)
        {
            if(p.charAt(j-1)=='*')
            {
                dp[0][j]=dp[0][j-2];
            }
        }
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                char patternChar=p.charAt(j-1);
                if(patternChar=='*'){
                    dp[i][j]=dp[i][j-2];
                    char previousChar=p.charAt(j-2);
                    if(previousChar=='.' || previousChar==s.charAt(i-1))
                    {
                        dp[i][j]=dp[i][j] || dp[i-1][j];
                    }
                }
                else if(patternChar=='.' || patternChar==s.charAt(i-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
            }
        }
        return dp[x][y];
    }
}