class Solution {
    public int minDistance(String word1, String word2) {
        int firstLength=word1.length();
        int secondLength=word2.length();
        // edits[i][j] is the minimum edits needed to turn
        // the first i characters of word1 into the first j characters of word2.
        int[][] edits=new int[firstLength+1][secondLength+1];
        // If either word is empty, insert or delete the remaining characters.
        for(int i=0;i<=firstLength;i++)
        {
            edits[i][0]=i;
        }
        for(int j=0;j<=secondLength;j++)
        {
            edits[0][j]=j;
        }
        for(int i=1;i<=firstLength;i++)
        {
            for(int j=1;j<=secondLength;j++)
            {
                char firstChar=word1.charAt(i-1);
                char secondChar=word2.charAt(j-1);
                if(firstChar==secondChar)
                {
                    edits[i][j]=edits[i-1][j-1];
                }
                else
                {
                    int replaceChar=edits[i-1][j-1];
                    int deleteChar=edits[i-1][j];
                    int insertChar=edits[i][j-1];
                    edits[i][j]=1+Math.min
                    (
                        replaceChar,
                        Math.min(deleteChar, insertChar)
                    );
                }
            }
        }
        return edits[firstLength][secondLength];
    }
}